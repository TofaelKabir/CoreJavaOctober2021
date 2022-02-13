package lec39_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B07_use_of_isSelected_method_by_cssSelector_locator {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/October2021CoreJava/driver/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}

	// if the class contain separate words, they are actually different class, then
	// we have to close the gap between class and we have to put period between them
	// cssSelector by class --> first html tag, then dot, then write class name inside the string, 
	// remove the space between class, and replace with dot or period
	// future reference: isDisplayed() should be used after explaining
	@Test (enabled = true, priority = 1)
	public void loginPageHeadingTest(){
		driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.mt-0.mb-0")).isDisplayed();
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
