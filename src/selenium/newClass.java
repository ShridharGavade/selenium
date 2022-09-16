package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newClass {

	public static void main(String[] args) throws InterruptedException {
//		making connection of chromedriver and system browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");
		
//		initialization of browser
		WebDriver driver =new ChromeDriver();
		
//	navigato to url	
//        driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
        
//        maximize the window
//        driver.manage().window().maximize();
//        
//        driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
//        Thread.sleep(3000);
//        
//        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("name");
      WebElement wb = driver.findElement(By.xpath("//input[@name='firstname']"));

        
        driver.navigate().back();
        
        
        
        
//        WebElement emailInput=driver.findElement(By.id("email"));
          
//        WebElement emailInput=driver.findElement(By.name("email"));
        
//        WebElement emailInput=driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
//        emailInput.click();
//        emailInput.sendKeys("abc@gmail.com");
        
        
//        WebElement abc = driver.findElement(By.linkText("Forgotten password?"));
        
//        WebElement abc = driver.findElement(By.partialLinkText("Forgotten "));
        
        
//        List<WebElement> links = driver.findElements(By.tagName("input"));
//        
//        
//        System.out.println(links.size());
//        
        
        Thread.sleep(3000);
//        abc.click();
        
//        WebElement emailInput=driver.findElement(By.);
//        Thread.sleep(3000);
//        
//        driver.close();
        
  	
	}

}
