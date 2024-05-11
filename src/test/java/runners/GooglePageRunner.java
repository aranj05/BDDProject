package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src//test//resources//features//UserLogin.feature",        //to run the feature files
		//features= "@target/FailedScenarios.txt",       //to run only failed scenario 
		glue= {"stepDefs"},
		dryRun= false,
		monochrome= true,
		plugin = {"pretty",
				"html:target/reports/HtmlReport.html",
				//"json:target/reports/JsonReport.json",
				//"usage:target/reports/UsageReport",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				//"rerun:target/FailedScenarios.txt",
		}
		)

public class GooglePageRunner extends AbstractTestNGCucumberTests {
  
}
