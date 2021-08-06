package com.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class Runner {


@CucumberOptions(
	features = "Feature/Login.feature",
	glue ="com.StepDef"
	
	
)

public class TestRunner extends AbstractTestNGCucumberTests {

	
}
}
