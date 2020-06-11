package Runner;

//For Junit
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;

//For Test NG
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

//For Junit
//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src\\test\\java\\Features"}, glue = "Steps", strict = true)
//public class TestRunner{}

//For Test NG
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-report-html/CucumberTestReport.json",
        },
        features = {"src\\test\\java\\Features"},
        glue = "Steps",
        strict = true

)
public class TestRunner  extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
