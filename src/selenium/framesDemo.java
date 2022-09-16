package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
//		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
//	   Thread.sleep(4000);
//	
//	   driver.switchTo().frame("packageListFrame");
//	   Thread.sleep(2000);
//	
//	   driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi']")).click();
//	   Thread.sleep(2000);
//	   
//	   driver.switchTo().defaultContent();
//	   
//	   driver.switchTo().frame("packageFrame");
//	   driver.findElement(By.xpath("//a[text()='BiDi']")).click();
//	   Thread.sleep(2000);
//	   
//	   driver.switchTo().defaultContent();
//	   driver.switchTo().frame("classFrame");
//	   driver.findElement(By.xpath("//a[text()='Overview']")).click();
//	   
		
		
		

	   Thread.sleep(10000);
	   driver.close();
	   
	   
	   
	}

}
