package lec40_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class N02_use_of_groups_from_TestNG {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/October2021CoreJava/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
		Thread.sleep(2000);
	}
	
	// use of groups
	@Test (enabled = true, groups = {"smokeTest", "functionalTest", "regressionTest"})
	public void mouseHoverActionOnAboutUsTest() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement aboutUs = driver.findElement(By.xpath("//a[contains(text(), 'About Us') and @class='hidden-xs dropdown']"));
		actions.moveToElement(aboutUs).build().perform();
		Thread.sleep(2000);	
	}
	
	// use of groups will be more clarified in automation framework
	@Test(enabled = true, groups = {"regressionTest"} )
	public void mouseHoverActionOnOurLocations() throws InterruptedException {
		Actions actions = new Actions(driver); // very important interview question
		WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
		Thread.sleep(2000);
		actions.moveToElement(ourLocations).build().perform();
		Thread.sleep(6000);	
		System.out.println("\nThe text of this web element is: "+ ourLocations.getText());
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	// Until now, whatever you learn, that will be used, mostly later part for interview only
	
	
}
