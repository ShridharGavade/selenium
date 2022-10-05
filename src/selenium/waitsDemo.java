package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/");
		
		
//		Implicit waits
		
//		selenium 3.0 and +
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		selenium 4.0 and +
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		

		
	
//		Eplicit wait 
		
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(30));
//		
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='moneycontrol.com']"))).click();
		
		
		
		
		
//		fluent wait
		
//		FluentWait wait1 = new FluentWait(driver);
//		wait.withTimeout(Duration.ofSeconds(30, 2));
//		wait.ignoring(NoSuchElementException.class);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='moneycontrol.com")));
		
		

////		//Declare and initialise a fluent wait
//		FluentWait wait1 = new FluentWait(driver);
////		//Specify the timout of the wait
//		wait.withTimeout(Duration.ofSeconds(100, 1));
////		//Sepcify polling time
////		
////		//Specify what exceptions to ignore
//		wait.ignoring(NoSuchElementException.class);
////
////		//This is how we specify the condition to wait on.
////		//This is what we will explore more in this chapter
//		wait.until(ExpectedConditions.alertIsPresent());
//		
		
		
		
		
//		driver.findElement(By.xpath("//a[text()='moneycontrol.com']")).click();
		
		
		
		
		
	}

}
