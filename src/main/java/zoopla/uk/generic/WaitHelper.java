package zoopla.uk.generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import zoopla.uk.basepage.BasePage;

public class WaitHelper extends BasePage {

	public static void waitUntilElementToBeClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public static void waitVisibilityOfAllElements(List<WebElement> element) {
		WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);
		waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(element));
	}
}
