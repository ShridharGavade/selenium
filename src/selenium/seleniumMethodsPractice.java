package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumMethodsPractice {

	public static void main(String[] args) throws InterruptedException {
//		to make connection between chromedriver and chrome browser on system
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");
	
//		browser initiation //		1. Open a browser
		WebDriver driver = new ChromeDriver();	
		
//		maximize the browser window
		driver.manage().window().maximize();
		
//		Q. Write a test script to perform following actions on webpage
//		2. Launch the Facebook application
		driver.get("https://www.facebook.com/");
		
//		3. Get the title of Facebook application and print in output console
		String title = driver.getTitle();
		System.out.println(title);		
		
//		4. Check Facebook page username is Enabled state or not and print in output console
		WebElement username = driver.findElement(By.id("email"));
		System.out.println("user name is enabled ? "+username.isEnabled());
		System.out.println(username.isDisplayed());
		
//		5. Check Facebook page password is Displayed state or not and print in output console
		WebElement password =driver.findElement(By.id("pass"));
		System.out.println("password element is displayed ?? "+password.isDisplayed());	
		
		System.out.println(password.isEnabled());
		
//		6. Enter value in username text box
		username.sendKeys("abc@gmail.com");
		
//		7. Capture the entered value in username text box and print in output console
		String uname = username.getAttribute("value");
		System.out.println(uname);
		
//		7.2  capture the already present text from webpage and print it
		WebElement text= driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String tt = text.getText();
		System.out.println(tt);
		
//		8. Navigate to another URL (freeCRM website  )
		driver.navigate().to("https://freecrm.com/");
		
//		9. Get the current URL and Title and print it in output console
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
//		10. Navigate back to facebook website, and get page title, and print in output console
        driver.navigate().back();
        
        System.out.println(driver.getTitle());
		Thread.sleep(2000);

        System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);

        
		
//		11. Navigate forward to freeCRM website
        driver.navigate().forward();
		Thread.sleep(2000);

//		12. Refresh the current page
        driver.navigate().refresh();
		Thread.sleep(2000);

		
//		13. Close the browser
		Thread.sleep(4000);
		driver.close();
		
	}

}
