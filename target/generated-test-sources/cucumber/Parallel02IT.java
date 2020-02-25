import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Rio/Eclipse-Workspace/Rio/sample-selenium-cucumber/src/test/resources/features/wikiHome.feature"},
        plugin = {"json:E:/Rio/Eclipse-Workspace/Rio/sample-selenium-cucumber/target/cucumber-parallel/2.json"},
        monochrome = false,
        tags = {},
        glue = {"stepDefs"})
public class Parallel02IT {
}
