package com.usa.failTestRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitTesting {
	WebDriver driver;

	@BeforeTest
	public void getSetUP() {
		WebDriverManager.chromedriver().setup();
		System.out.println("GetChromeOne Method is running on Thread : " + Thread.currentThread().getId());
		driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Browser is open");
	}

	@Test
	public void getFunctionalTestOne() throws InterruptedException {

		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		System.out.println("TestOne");
		Thread.sleep(3000);
	}

	@Test
	public void getFunctionalTestTwo() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("TestTwo");
		Thread.sleep(3000);
	}

	@Test
	public void getFunctionalTestThree() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("TestThree");
		Thread.sleep(3000);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Browser is closed");
	}
}
