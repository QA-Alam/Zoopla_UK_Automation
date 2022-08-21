package zoopla.uk.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import zoopla.uk.basepage.BasePage;

public class WaitHelper extends BasePage {

	public static void waitUntilElementToBePresent(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}
}
