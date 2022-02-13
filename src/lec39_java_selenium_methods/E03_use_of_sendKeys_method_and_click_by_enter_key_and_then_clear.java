package lec39_java_selenium_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class E03_use_of_sendKeys_method_and_click_by_enter_key_and_then_clear {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/October2021CoreJava/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
	}
	// Regular way to click a submit button to search something	
	@Test (enabled=true, priority = 1)
	public void searchAProductTest01() throws InterruptedException{		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
	}
	
	// click submit button by Enter key from keyboard	
	@Test (enabled=true, priority = 2)
	public void searchAProductTest02() throws InterruptedException{		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop", Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad", Keys.RETURN);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell XPS 15", Keys.TAB);
		Thread.sleep(3000);
		
	}
		
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
