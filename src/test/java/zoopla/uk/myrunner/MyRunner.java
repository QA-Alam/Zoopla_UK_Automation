package zoopla.uk.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },		 	
		features = {".//Features/"}, 
        glue = {"zoopla.uk.stepdefintaions",}, 	
        	   //dryRun = false,  // Stop the execution and give me new steps = true
        	                               // If false then browser and steps 
                monochrome = true, 
               //strict = false,
		tags = "@Sanity")   
public class MyRunner extends AbstractTestNGCucumberTests {

}