package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import cucumber.api.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue="login_step_def",dryRun=true,

plugin= {"pretty","html:src\\test\\resources\\Reports"}

)
public class test_runner {


	
}
