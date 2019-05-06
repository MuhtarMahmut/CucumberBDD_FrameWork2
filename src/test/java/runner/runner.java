package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)   // allows us to run cucumber with junit by using @runwith ennotation
@CucumberOptions(

        features = "src/test/Features" ,  // it defines where the feature files are located at
        tags = "@UserStory01",    // decides which feature file or scenario to run,( multiple featue files and scanrios can share same tagname)
        glue = "TestSteps" ,       //  defines where the cucumber annotations (Step-Difinition and hooks class)  are at.
        dryRun = false,  // when dryrun is true: runs the feature file only and will give the unimplimented steps
        // when dryrun is false: it runs the entire step definitions first then runs the feature file ill give the unimplimented steps

        plugin = {
                "html:src/test/CucumberReports/HTML" ,
                "junit:src/test/CucumberReports/JUNIT/MyJunit.xml",
                "usage:src/test/CucumberReports/Usage/MyUsage.js",
                "pretty:src/test/CucumberReports/Pretty/Myprestty.txt"
        }       // to generate report:     reportTye:location

)
public class runner {



}
