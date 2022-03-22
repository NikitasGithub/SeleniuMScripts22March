package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void method1() {
		// TODO Auto-generated method stub
		
		// Open a Chrome browser
		
		WebDriver  driver = new ChromeDriver();
		
		
	     // maxamize the browser window
		
		driver.manage().window().maximize();
		
		// Delete browser cookies
		
		driver.manage().deleteAllCookies();
		
		// Enter the application url
		
		driver.get("https://www.wikipedia.org/");
		
		// Close the browser
		
		driver.close();
		

	}

}
