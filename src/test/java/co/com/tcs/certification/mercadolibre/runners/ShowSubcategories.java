package co.com.tcs.certification.mercadolibre.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/show_subcategories.feature",
        glue = "co.com.tcs.certification.mercadolibre.stepdefinitions",
        snippets = SnippetType.CAMELCASE
//      ,tags = "@successScenario"
)
public class ShowSubcategories {
}
