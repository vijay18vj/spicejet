package com.ui.bestbuy_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features= " src/test/java/Bestbuy.feature " ,
		glue="com.ui.step_definition",
		dryRun= false,
		monochrome= true
	)
public class bestbuy_runner {

}
