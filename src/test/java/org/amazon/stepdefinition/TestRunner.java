package org.amazon.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features", glue="org.amazon.stepdefinition", plugin="json:target/amazon.json")

public class TestRunner {
	
	
	
}

