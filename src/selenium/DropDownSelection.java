package selenium;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(2000);
		
		Select sel = new Select(day);
		Thread.sleep(2000);
		sel.selectByValue("15");
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByVisibleText("Jan");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel2=new Select(year);
		Thread.sleep(2000);
		sel2.selectByVisibleText("2010");
		Thread.sleep(2000);
//		sel2.deselectAll();
		
		
		List<WebElement> months = sel1.getOptions();
		System.out.println(months.size());
		ListIterator<WebElement> ls = months.listIterator();
		while(ls.hasNext()) {
			System.out.println(ls.next().getText());
		}
		
	System.out.println("=================================================");	
		
		List<WebElement>  days = sel.getOptions();
		
		ListIterator<WebElement> l = days.listIterator();
		
		while(l.hasNext()) {
			System.out.println(l.next().getText());
		}
		


	}

}
