package com.training.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:target/cucumber-reports/cucumber.html",      
                        "json:target/cucumber-reports/cucumber.json"},
                features="C:\\Users\\sandh_ctyq64n\\eclipse-workspace\\CucumberFramework\\resources\\SalesforceGeneric.feature",
                glue= {"com.training.steps"} ,
                tags="@smoke and @functional")

public class Runner{
	
}



