package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue= "src/test/java/stepDefs",plugin= { "json:target/cucumber/cucumber.json", "html:target/site/cucumber-pretty"})
public class wiki_runner {
}