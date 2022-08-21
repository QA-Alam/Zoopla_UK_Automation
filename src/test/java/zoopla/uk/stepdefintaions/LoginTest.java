package zoopla.uk.stepdefintaions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import zoopla.uk.basepage.BasePage;
import zoopla.uk.elementspage.LoginElementsPage;
import zoopla.uk.generic.CommonUtility;
import zoopla.uk.generic.WaitHelper;

public class LoginTest extends BasePage {
	LoginElementsPage pf;

	@Given("^User able to open a any browser$")
	public void user_able_to_open_a_any_browser() {

		BasePage.initializations();
		pf = new LoginElementsPage();

	}

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String url) {
		driver.get(url);
	}

	@When("^User able to click on sign-in button$")
	public void user_able_to_click_on_sign_in_button() {
		WaitHelper.waitUntilElementToBePresent(pf.getClickOnSignButton());
		pf.getClickOnSignButton().click();
	}

	@When("^User able to enter valid userName & password$")
	public void user_able_to_enter_valid_userName_password() {
		pf.getUserNameAndPwd(prop.getProperty("userName"), prop.getProperty("pwd"));

	}

	@When("^User able to click on login button$")
	public void user_able_to_click_on_login_button() {
		// CommonUtility.getActionClick(pf.getSignBTN());
		WaitHelper.waitUntilElementToBePresent(pf.getSignBTN());
		CommonUtility.getJSClick(pf.getSignBTN());

	}

	@Then("^User can verify the user information \"([^\"]*)\" on the grid$")
	public void user_can_verify_the_user_information_on_the_grid(String text) {

	}

}
