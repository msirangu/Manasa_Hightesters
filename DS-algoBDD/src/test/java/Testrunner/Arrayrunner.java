package Testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/rsirangu/eclipse-workspace-maven/DS-algoBDD/src/test/java/Feature"},
		glue = {"Stepdefinition"},
		monochrome=true,
		plugin = {"pretty" ,}
)

public class Arrayrunner {

}


