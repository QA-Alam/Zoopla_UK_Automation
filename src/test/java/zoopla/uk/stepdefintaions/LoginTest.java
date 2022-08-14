package zoopla.uk.stepdefintaions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import zoopla.uk.basepage.BasePage;
import zoopla.uk.elementspage.LoginElementsPage;

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
		pf.getClickOnSignButton().click();
	}

	@When("^User able to enter valid userName & password$")
	public void user_able_to_enter_valid_userName_password() {

	}

	@When("^User able to click on login button$")
	public void user_able_to_click_on_login_button() {

	}

	@Then("^User can verify the user information \"([^\"]*)\" on the grid$")
	public void user_can_verify_the_user_information_on_the_grid(String text) {

	}

}
