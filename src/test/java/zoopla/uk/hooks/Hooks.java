package zoopla.uk.hooks;

import org.testng.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import zoopla.uk.basepage.BasePage;

public class Hooks extends BasePage {

	@Before
	public void setupApplication() {
		Reporter.log("=====Browser Session Started=====", true);
	}

	@After
	public void closeApplication() {
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);

	}

}
