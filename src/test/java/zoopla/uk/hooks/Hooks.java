package zoopla.uk.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import zoopla.uk.basepage.BasePage;

public class Hooks  extends BasePage{

	
	@Before
	public void setUp() {
		BasePage.initializations();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
