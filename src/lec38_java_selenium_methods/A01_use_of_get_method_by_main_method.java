package lec38_java_selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_use_of_get_method_by_main_method {

	public static void main(String[] args) {
		// System is a class and setProperty is a method
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/October2021CoreJava/driver/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class which implements WebSriver interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // or fullscreen() method
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		driver.quit();
		
		
	}

}
