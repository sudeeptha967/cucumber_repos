package cucumber_testme_demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@regression"},plugin="json:target\\Jsonreport.json")
//tags={"~@regression"}) //ignore regression
//tags={"@login","@regression"})// - AND case
//tags={"@login,@regression"},
//plugin="html:target\\HtmlReport") // OR case
//plugin="json:target\\Jsonreport.json")
//plugin="junit:target\\xmlreport.xml")
public class runner {

}
