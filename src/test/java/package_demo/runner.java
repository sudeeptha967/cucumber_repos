package package_demo;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/feature1.feature",
				glue="testme_package")
				//tags={"@login"})
				//tags={"~@regression"}) //ignore regression
				//tags={"@login","@regression"})// - AND case
				//tags={"@login,@regression"},
				//plugin="html:target\\HtmlReport") // OR case
				//plugin="json:target\\Jsonreport.json")
				//plugin="junit:target\\xmlreport.xml")
public class runner {
}
