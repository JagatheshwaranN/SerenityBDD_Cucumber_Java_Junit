package qa.jtaf.serenity.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/", glue = { "qa/jtaf/serenity/steps", "qa/jtaf/serenity/step",
		"qa/jtaf/serenity/pages", "com/jtaf/qa/utilities" }, plugin = { "pretty",
				"json:target/cucumber/report/report.json",
				"junit:target/cucumber/report/report.xml" }, publish = true, monochrome = true, tags = "@login")
public class CucumberTestSuite {

}
