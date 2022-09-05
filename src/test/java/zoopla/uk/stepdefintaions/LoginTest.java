package zoopla.uk.stepdefintaions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.*;
import zoopla.uk.basepage.BasePage;
import zoopla.uk.elementspage.LoginElementsPage;
import zoopla.uk.generic.CommonUtility;
import zoopla.uk.generic.WaitHelper;

public class LoginTest extends BasePage {
	LoginElementsPage pf;

	@Given("^User able to open a any browser$")
	public void user_able_to_open_a_any_browser() {
		// pf = new LoginElementsPage();
		pf = PageFactory.initElements(driver, LoginElementsPage.class);
		initializations();
	}

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String url) {
		logger.info("User able to enter the url  ");
		driver.get(url);
	}

	@When("^User able to click on sign-in button$")
	public void user_able_to_click_on_sign_in_button() {
		logger.info("User able to click on sign-in button ");
		WaitHelper.waitUntilElementToBeClickable(pf.getClickOnSignButton());
		CommonUtility.getActionClick(pf.getClickOnSignButton());
		// CommonUtility.getJSClick(pf.getClickOnSignButton());
		// pf.getClickOnSignButton().click();
	}

	@When("^User able to enter valid userName & password$")
	public void user_able_to_enter_valid_userName_password() {
		logger.info("User able to enter valid userName & password ");
		pf.getUserNameAndPwd(prop.getProperty("userName"), prop.getProperty("pwd"));
	}

	@When("^User able to click on login button$")
	public void user_able_to_click_on_login_button() {
		logger.info("User able to click on login button");
		// CommonUtility.getActionClick(pf.getSignBTN());
		WaitHelper.waitUntilElementToBeClickable(pf.getSignBTN());

		// driver.navigate().refresh();
		CommonUtility.getActionClick(pf.getSignBTN());
		// CommonUtility.getJSClick(pf.getSignBTN());
	}

	@Then("^User can verify the user information \"([^\"]*)\" on the grid$")
	public void user_can_verify_the_user_information_on_the_grid(String text) {
		// First way of doing verification
		Assert.assertEquals(text, pf.getVerifyText().getText());
		System.out.println("Expected & Actual are equal ");

		// 2nd way of doing verification

		if (text.equals(pf.getVerifyText().getText())) {
			System.out.println("Expected  & Actual are equal ");
		} else {
			System.out.println("Expected  & Actual are not equal ");
		}

		logger.info("User can verify the user information");
		CommonUtility.getVerifyTheResult(text, pf.getVerifyText().getText());
		
	}

}
