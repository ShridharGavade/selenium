package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDeme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
//		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		
//		Thread.sleep(3000);
//		
//		WebElement w1 = driver.findElement(By.id("box1"));
//		
//		WebElement b1 = driver.findElement(By.id("box101"));
//		WebElement b6 = driver.findElement(By.id("box106"));
//		WebElement b2 = driver.findElement(By.id("box102"));
//		WebElement b3 = driver.findElement(By.id("box103"));
//		WebElement b4 = driver.findElement(By.id("box104"));
//		Actions act = new Actions(driver);
//		
////		act.dragAndDrop(w1, b1).build().perform();
//		
//		act.clickAndHold(w1).build().perform();
//		
//	
//		
//		act.moveToElement(b6);
//		
		Thread.sleep(3000);
//act.moveToElement(b2);
//		
//		Thread.sleep(3000);
//		
//act.moveToElement(b3);
//		
//		Thread.sleep(3000);
//act.moveToElement(b4);
//		
//		Thread.sleep(3000);
		
//		act.release(b1).build().perform();
	
		
		
		
		
		
		
		
		
		
//		System.out.println(driver.manage().window().getSize().getHeight());
//		System.out.println(driver.manage().window().getSize().getWidth());
//		
//		Thread.sleep(5000);
//		
//		Dimension d = new Dimension(600,1200);
//		
//		driver.manage().window().setSize(d);
//		
//		
//		Thread.sleep(5000);
//		
//		driver.manage().window().fullscreen();
//		
//		System.out.println(driver.manage().window().getSize().getHeight());
//		System.out.println(driver.manage().window().getSize().getWidth());
		
		
		
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act= new Actions(driver);
		
		for (int i = 1; i <= 7; i++) {

			WebElement src = driver.findElement(By.id("box"+i));

			WebElement trg = driver.findElement(By.id("box10"+i));

			act.dragAndDrop(src, trg).build().perform();
	
			Thread.sleep(2000);
		}

		Thread.sleep(5000);
		
		for (int i = 1; i <= 7; i++) {
			
	
			WebElement src = driver.findElement(By.id("box"+i));
			
			WebElement cap =driver.findElement(By.id("capitals"));
			
			act.dragAndDrop(src, cap).build().perform();
			
			
			
		}
	

	}

}
