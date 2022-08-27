package zoopla.uk.generic;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import zoopla.uk.basepage.BasePage;

public class CommonUtility extends BasePage {

	// Action Click
	public static void getActionClick(WebElement elm) {
		Actions obj = new Actions(driver);
		obj.click(elm).build().perform();
	}

	public static Actions getAction() {
		Actions action = new Actions(driver);
		return action;
	}

	
	public static boolean getVerifyTheResult(String Expected, String Actual) {
		Assert.assertEquals(Expected, Actual);
		if (Expected.equals(Actual)) {
			System.out.println("Expected And Actual are equal");
		}else {
			System.out.println("Expected And Actual dose not equal");
		}
		return true;
	}
	
	// JS click
	public static void getJSClick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);

	}

	

	public static void get() {
		// First - set the wait parameters
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS) // set the timeout
				.pollingEvery(5, TimeUnit.SECONDS) // set the interval between every 2 tries
				.ignoring(NoSuchElementException.class); // don't throw this exception
		// Then - declare the webElement and use a function to find it
		WebElement waitingElement = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("Start"));
			}
		});
		waitingElement.click();
	}

}
