package com.endava.intership.Framework.TestCycle.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/feature/Login.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
        "html:target/home-page-html"},
        tags = "@Positive",
        glue = {"com.endava.intership.Framework.Infrastructure.Driver",
                "com.endava.intership.Framework.PageObjects.LoginPage"} )
public class LoginTest {

}
