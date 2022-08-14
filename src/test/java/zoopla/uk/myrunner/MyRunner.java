package zoopla.uk.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },		 	
		features = {".//Features/"}, 
        glue = {"zoopla.uk.stepdefintaions",}, 	
		dryRun = false, 
		monochrome = true, 
		strict = true,
		tags = "@Sanity")   
public class MyRunner extends AbstractTestNGCucumberTests {

}