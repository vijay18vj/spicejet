package ui.com.Sp_testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features= " src/test/java/SpiceJet.feature " ,
		glue="Spicejet_step_def",
		dryRun= false,
		monochrome= true
	)

public class Sp_testrunner {

}
