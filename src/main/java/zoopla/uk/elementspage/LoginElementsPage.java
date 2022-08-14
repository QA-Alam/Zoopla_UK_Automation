package zoopla.uk.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.basepage.BasePage;

public class LoginElementsPage extends BasePage {

	public LoginElementsPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id='__next']/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")
	@CacheLookup
	private WebElement clickOnSignButton;

	public WebElement getClickOnSignButton() {
		return clickOnSignButton;
	}

}
