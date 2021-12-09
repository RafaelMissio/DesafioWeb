
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Attachment;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        plugin = {"pretty", "html:target/report-html"},
        monochrome = true,
        glue = {"steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {



}
