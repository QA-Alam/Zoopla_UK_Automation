package zoopla.uk.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla.uk.basepage.BasePage;
import zoopla.uk.generic.WaitHelper;

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

	@FindBy(id = "email")
	@CacheLookup
	private WebElement userName;

	public WebElement getEnterUserName() {
		return userName;
	}

	@FindBy(id = "password")
	@CacheLookup
	private WebElement enterPwd;

	public WebElement getEnterPwd() {
		return enterPwd;
	}

	@FindBy(xpath = "//*[text()='Sign in']")
	@CacheLookup
	private WebElement signBTN;

	public WebElement getSignBTN() {
		return signBTN;
	}

	@FindBy(xpath = "//*[text()='Welcome back to your account']")
	@CacheLookup
	private WebElement verifyText;
	public WebElement getVerifyText() {
		return verifyText;
	}

	
	
	public void getUserNameAndPwd(String uName, String pwd) {
		WaitHelper.waitUntilElementToBeClickable(getEnterUserName());
		getEnterUserName().sendKeys(uName);
		WaitHelper.waitUntilElementToBeClickable(getEnterPwd());
		getEnterPwd().sendKeys(pwd);
	}
}
