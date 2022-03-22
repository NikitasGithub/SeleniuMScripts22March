package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase4 {
	WebDriver driver;

	@Test
	public void method1()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		// Selenium to find a web element on you app page and perform action
		
		// id, name, tag & class , type
		
		// Locators
		// id, name, tagname. classname, xpath, css Selector, linktext, patiallinktext
		
		
		driver.findElement(By.id("searchInput")).sendKeys("selenium testing");
		
		
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
		
		
		
		String actualtitle = driver.getTitle();
		
		// Validating if actual result is same as expected result
		
	Assert.assertEquals(actualtitle, "selenium testing - Search results - Wikipedia");
			
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}
