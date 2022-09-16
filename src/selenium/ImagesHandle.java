package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesHandle {

	public static void main(String[] args) throws InterruptedException {
	
//		connection
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");

//		initialize the browser 
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.facebook.com/");
//		
//		Thread.sleep(3000);
//		
//		
//		WebElement flogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		Thread.sleep(2000);
//		System.out.println(flogo.isDisplayed());
//	     System.out.println(flogo.isEnabled());
//	     System.out.println(flogo.isSelected());
		
		
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(3000);
		
		WebElement wb = driver.findElement(By.xpath("//img[@alt='Sauce Labs']"));
		System.out.println(wb.isDisplayed());
	     System.out.println(wb.isEnabled());
	     System.out.println(wb.isSelected());
		wb.click();
		
	
	
	Thread.sleep(10000);
	driver.close();
		
	}

}
