package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class waits {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage ().timeouts ().implicitlyWait (3000, TimeUnit.MILLISECONDS);	
		driver.manage ().timeouts ().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
		WebDriverWait wai = new WebDriverWait(driver, Duration.ofSeconds(100,1));
//		wait.until(ExpectedConditions.vi)
		
		
		//Declare and initialise a fluent wait
		FluentWait wait1 = new FluentWait(driver);
		//Specify the timout of the wait
		wait.withTimeout(Duration.ofSeconds(100, 1));
		//Sepcify polling time
		
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class);

		//This is how we specify the condition to wait on.
		//This is what we will explore more in this chapter
		wait.until(ExpectedConditions.alertIsPresent());
		
		

	}

}
