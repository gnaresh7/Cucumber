package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\gnababu\\Desktop\\Cucumber_1\\nopCommerceV001_Cucumber\\Features\\Login.feature",
                 glue="stepDefinitions",
                 dryRun=false             
		
		)

public class TestRun {
	
	

}
