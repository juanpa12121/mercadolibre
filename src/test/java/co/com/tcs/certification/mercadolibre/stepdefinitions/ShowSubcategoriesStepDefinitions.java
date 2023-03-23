package co.com.tcs.certification.mercadolibre.stepdefinitions;

import co.com.tcs.certification.mercadolibre.tasks.SelectCategory;
import co.com.tcs.certification.mercadolibre.userinterfaces.MercadoLibrePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.tcs.certification.mercadolibre.utils.Constants.ACTOR_NAME;

public class ShowSubcategoriesStepDefinitions {

    MercadoLibrePage page;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME);
    }

    @Given("^The user is on Mercado Libre page$")
    public void theUserIsOnMercadoLibrePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));
    }

    @When("^The user clicks on the category (.*)$")
    public void theUserClicksOnTheCategory(String category) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectCategory.option(category));
    }

    @Then("^The user should see the subcategories$")
    public void theUserShouldSeeTheSubcategories() {

    }
}
