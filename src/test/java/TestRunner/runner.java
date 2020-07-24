package TestRunner;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/java/cucumber/feature/login.feature",glue={"steps"},plugin = { "json:target/JSON/Desktop.json"})						
public class runner {

}
