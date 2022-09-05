package com.usa.failTestRun;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	private static WebDriver driver;

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { { "alam", "SAYEDawan2008" }, 
			                                    { "alam", "SAYEDawan2008" }, 
			                                     { "alam", "SAYEDawan2008" } };
	}

	// Here we are calling the Data Provider object with its Name

	@Test(dataProvider = "Authentication")
	public void test(String sUsername, String sPassword) {
		WebDriverManager.chromedriver().setup();
		System.out.println("GetChromeOne Method is running on Thread : " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://shop.demoqa.com/my-account/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(sUsername);
		driver.findElement(By.id("password")).sendKeys(sPassword);
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		driver.quit();

	}

}