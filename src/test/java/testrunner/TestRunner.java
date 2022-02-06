package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/sourceanddestination.feature",
        glue= {"stepdef"},
        monochrome = false,
        publish = true,
        plugin={"pretty","html:test-output","json:jshon_output/cucumber.json","junit:junit-output/cucumber.xml" })


public class TestRunner {

}
