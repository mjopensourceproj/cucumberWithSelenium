package org.cucumberselenium.cucumberSelenium.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature", glue="gluecode")
public class baseTestRunner {

}
