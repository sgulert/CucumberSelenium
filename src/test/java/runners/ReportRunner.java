package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\features" },
        glue = {"stepdefinitions"},
        plugin = {
                "html: Reports\\htmlReport.html" ,
                "json: Reports\\jsonReport.json",
                "junit:Reports\\junitReport.xml"
        }
)
public class ReportRunner {
    //1. ExtentReport  (Third party Reporting Framework)

    //2. Cucumber Built in Reports

    //cucumber hmtl, xml, junitraporları üretir.
}
