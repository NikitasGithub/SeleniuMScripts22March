package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test(priority='1')
	public void testmethod1()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		String title = driver.getTitle();
		
		System.out.println(" title of the page on Chrome browser is " + title);
		driver.close();
		
	}
	
	@Test(priority='2')
	public void testmethod2()
	{
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.selenium.dev/downloads/");
		String title = driver1.getTitle();
		
		System.out.println(" title of the page on FF browser is " + title);
		
		driver1.close();
		
		
	}

}
