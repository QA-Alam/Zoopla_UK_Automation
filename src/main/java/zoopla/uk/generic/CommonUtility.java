package zoopla.uk.generic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	public static boolean getVerifyTheResult(String ExpectedResult, String Actual) {
		Assert.assertEquals(ExpectedResult, Actual);
		if (ExpectedResult.equals(Actual)) {
			System.out.println("Expected & Actual are equals ");
		} else {
			System.out.println("Expected & Actual are not equals ");
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

	public boolean isElementPresent(WebElement locator) {
		if (locator.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyIfEquals(WebElement locator, String expectedTxt) {
		if (isElementPresent(locator)) {
			String actualTxt = locator.getText();
			if (expectedTxt.equals(actualTxt))
				return true;
			else
				return false;
		} else
			return false;
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}
}
