package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_5418\\eclipse-workspace\\selenium\\chromeDriver\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
////		this method clears the browser history 
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		System.out.println("==========Maximize =============");
		Dimension d = driver.manage().window().getSize();

		System.out.println("height = " + d.getHeight());
		System.out.println("width  = " + d.getWidth());	
		
		Thread.sleep(4000);
		
//		how to set window size mannually (400, 600)
		
	Dimension dim = new Dimension(400,600);
	
	driver.manage().window().setSize(dim);
	
	System.out.println("=============== Size 1 ================");
	Dimension d1 = driver.manage().window().getSize();

	System.out.println("height = " + d1.getHeight());
	System.out.println("width  = " + d1.getWidth());	
	Thread.sleep(4000);
	
Dimension dim2 = new Dimension(600,1000);
	
	driver.manage().window().setSize(dim2);
	
	System.out.println("=============== Size 2 ================");
	Dimension d2 = driver.manage().window().getSize();

	System.out.println("height = " + d2.getHeight());
	System.out.println("width  = " + d2.getWidth());
	
	Thread.sleep(4000);
	System.out.println("=============== full screen ================");

	driver.manage().window().fullscreen();
		
	
	Dimension d3 = driver.manage().window().getSize();

	System.out.println("height = " + d3.getHeight());
	System.out.println("width  = " + d3.getWidth());	
	
	
		
		
		
		
	}

}


//https://opensource-demo.orangehrmlive.com/
