package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\Downloads\\chromedriver_win32 new\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		
		WebElement click = driver.findElement(By.id("alert2"));
		
		
		Actions act = new Actions(driver);
		
		act.click(click).build().perform();
		
		
		Thread.sleep(10000);
		driver.close();
		
		
//		adding
		
		
		
	}

}
