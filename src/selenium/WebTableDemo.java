package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(3000);
		
		WebElement table = driver.findElement(By.id("table1"));
		
		
//		1.count the rows 
		List<WebElement> ls = table.findElements(By.tagName("tr"));
		
		int rows = ls.size();
		System.out.println(rows);
		
//		2. count the columns
		List<WebElement> col = table.findElements(By.tagName("th"));
		int columsize = col.size();
		System.out.println("total colums are :-"+ columsize);
		
//		3. count total number of cells 
//		List<WebElement> cells = table.findElements(By.xpath("//table[@id='table1']//td"));
		List<WebElement> cells = table.findElements(By.tagName("td"));
		int cellsSize = cells.size();
		System.out.println("total cells are :-"+ cellsSize);
		
//		3.printing all cells data
		
//		for(int i=0; i<=cellsSize;i++ ){
//			WebElement wb = cells.get(i);
//			System.out.println(wb.getText());
//			
//		}
//		
//		for(WebElement w:cells) {
//			
//			System.out.println(w.getText());
//			
//		}
//		
		
		
		
//		4. get the data from individual cell.
		
		WebElement cel = driver.findElement(By.xpath("//table//tr[3]//td[1]"));
		System.out.println(cel.getText());
		
		Thread.sleep(6000);
		driver.close();
		
	}

}
