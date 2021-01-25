package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/main/java/feature/login.feature",glue= {"steps","hooks"},monochrome=true)
public class Runner extends AbstractTestNGCucumberTests {

	
}
//dryRun=true, snippets=SnippetType.CAMELCASE