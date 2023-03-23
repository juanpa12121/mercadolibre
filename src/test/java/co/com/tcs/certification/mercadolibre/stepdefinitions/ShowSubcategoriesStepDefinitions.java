package co.com.tcs.certification.mercadolibre.stepdefinitions;

import co.com.tcs.certification.mercadolibre.userinterfaces.MercadoLibrePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class ShowSubcategoriesStepDefinitions {

    MercadoLibrePage page;
    @Given("^The user is on Mercado Libre page$")
    public void theUserIsOnMercadoLibrePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));
    }


    @When("^The user clicks on the category (.*)$")
    public void theUserClicksOnTheCategoryHogarYMuebles(String category) {
    }

    @Then("^The user should see the subcategories$")
    public void theUserShouldSeeTheSubcategories() {

    }

}
