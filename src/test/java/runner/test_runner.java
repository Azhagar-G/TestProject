package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue="login_step_def",dryRun=true

//plugin= {"pretty","json:src\\test\\resources"

)
public class test_runner {

}
