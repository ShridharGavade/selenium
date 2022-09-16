package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//input[@id='alert1']")).click();
//		
//		Thread.sleep(3000);
//		
//		Alert al = driver.switchTo().alert();
//		
//		String alertMsg = al.getText();
//		
//		System.out.println(alertMsg);
//		
//		Thread.sleep(3000);
//		
//		al.accept();
		
		
//		driver.findElement(By.id("prompt")).click();
//		
//		Thread.sleep(3000);
//		
//		Alert al =driver.switchTo().alert();
//		
//		String msg =al.getText();
//	
//		if(msg.equals("What is your name?")) {
//			System.out.println("test case is pass");
//		}
//		else {
//			System.out.println("Test case is fail");
//		}
//		
//		Thread.sleep(2000);
//		 al.dismiss();
		
		
//		driver.findElement(By.id("confirm")).click();
//		
//		Alert a =driver.switchTo().alert();
//		
//		System.out.println(a.getText());
//		
//		a.accept();
//		
		
		Thread.sleep(3000);
		driver.close();
	
		
	}

}
