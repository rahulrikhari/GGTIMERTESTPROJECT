package com.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 
@CucumberOptions(features = "classpath:EggTimer.feature",
glue= "com.test.stepdefinition",
tags = {"@test"}, 
plugin = {"pretty", "html:target/cucumber","json:target/Json/cucumber.json"},


monochrome = true) 


public class StepRunner {
}
