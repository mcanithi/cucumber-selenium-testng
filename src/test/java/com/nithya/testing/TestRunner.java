package com.nithya.testing;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",
glue ={"com.nithya.testing.stepdef"},
plugin= {"pretty:target/cucumber-pretty.txt",
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"
        })
public class TestRunner extends AbstractTestNGCucumberTests{

}
