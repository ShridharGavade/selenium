package learnIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
//		
//		WebElement a = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		
//		System.out.println(a.isDisplayed());
//		System.out.println(a.isEnabled());
//
//
//		System.out.println(a.getText());
		
		
//		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//img[@alt='BrowserStack']")).click();
		driver.switchTo().frame("packageListFrame");
		
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();

		driver.switchTo().frame("classFrame");
//		driver.findElement(By.xpath("//a[text()='Overview']")).click();

	}

}
