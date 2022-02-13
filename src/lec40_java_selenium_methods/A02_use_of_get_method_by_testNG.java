package lec40_java_selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A02_use_of_get_method_by_testNG {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/October2021/driver/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver"); // for chrome also forward slash
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver");  // for chrome also forward slash
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
	}
	
	@Test
	public void urlTest() throws InterruptedException {
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
