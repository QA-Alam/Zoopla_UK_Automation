package zoopla.uk.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import zoopla.uk.basepage.BasePage;

public class CommonUtility extends BasePage {

	
	// Action Click 
	public static void getActionClick(WebElement elm) {
		Actions obj = new Actions(driver);
		obj.click(elm).build().perform();
	}
   // JS click
	public static void getJSClick(WebElement elm) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elm);

	}
}
