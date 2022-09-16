package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumMethods {

	public static void main(String[] args) throws InterruptedException {
//		making connection of chromedriver and system browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");
		
//		initialization of browser
//		WebDriver dr = new WebDriver();
		 
		WebDriver driver =new ChromeDriver();
		
		
//      maximize the window
      driver.manage().window().maximize();
		
//	navigato to url	
//		driver.get("https://www.facebook.com/");
		
//		getTitle
//		String title = driver.getTitle();
//		System.out.println(title);
		
//		getCurrentUrl()
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		getPage Source
		
//		String src = driver.getPageSource();
//		System.out.println(src);
		
//		navigate().to()
		
		driver.navigate().to("https://www.google.com/");
		
		boolean ret = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).isEnabled();
		System.out.println(ret);
		
		boolean re = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).isDisplayed();
		System.out.println(re);

		
		
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
		
		
		driver.manage().window().minimize();
		
		
//		driver.findElement(By.xpath("//img[@alt='Google']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
//		Thread.sleep(2000);
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		
		
		
		
		
		
		
//		Thread.sleep(4000);
//		driver.quit();
		
		
		
		
		

      
        

		
		
	}

}
