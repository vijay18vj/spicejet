package com.ui.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="Feature.feature" ,
		glue ="com.ui.step_definition" ,
		dryRun= false,
		monochrome= true
		)
public class TestRunner {

}
