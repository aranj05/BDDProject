package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src//test//resources//taggedfeatures//",        //to run the feature files
		glue= {"stepDefs"},
		dryRun= false,
		monochrome= true,
		plugin = {"pretty"},
		//tags="@RegressionTest"
		//tags="@RegressionTest and @SmokeTest"    //Executed TCs should have both tags
		//tags="@RegressionTest or @SmokeTest"		//Executed TCs should have any of the given tags
		//tags= "@PhaseTwo and @SmokeTest"							//Feature Level tag
		tags= "@PhaseTwo and not @SmokeTest"       //Execute TC for PhaseOne other than somkeTest tags
		
		)

public class TaggedRunner extends AbstractTestNGCucumberTests {

}
