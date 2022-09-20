package automation.challenges;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollDown {

	static WebDriver d;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/guru99home/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for Implicit wait
		d.manage().window().maximize();

		// to perform Scroll on application using Selenium
		
		//JavascriptExecutor js = (JavascriptExecutor) d;
		// js.executeScript("window.scrollBy(0,1000)");
		
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// Locate the desired WebElement
		// WebElement element = driver.findElement(By.linkText("All Browsers and Devices"));
	// js.executeScript("arguments[0].scrollIntoView();", element);

		// object of Actions class to scroll up and down
		Actions at = new Actions(d);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(3000);
		// identify element on scroll down
		// WebElement l = d.findElement(By.linkText("Latest Courses"));
		// String strn = l.getText();
		// System.out.println("Text obtained by scrolling down is :"+strn);

		//at.sendKeys(Keys.PAGE_UP).build().perform();
	}

}