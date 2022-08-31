package co.com.prueba.llaves.stepdefinitions;

import co.com.pruebas.llaves.models.Credentials;
import co.com.pruebas.llaves.tasks.Login;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Andrés");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }
    @Given("^that enter the page \"([^\"]*)\"$")
    public void that_enter_the_page(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^enter valid credentials$")
    public void enter_valid_credentials(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        theActorInTheSpotlight().attemptsTo(Login.enter(credentials));
    }

    @Then("^the user will be logged in correctly$")
    public void the_user_will_be_logged_in_correctly() {

    }

    @Given("^that enter on the page \"([^\"]*)\"$")
    public void that_enter_on_the_page(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^enter incorrect credentials$")
    public void enter_incorrect_credentials(List<Credentials> credentialsList) {

        Credentials credentials;
        credentials = credentialsList.get(0);
        theActorInTheSpotlight().attemptsTo(Login.enter(credentials));


    }

    @Then("^the user will be logged in incorrectly$")
    public void the_user_will_be_logged_in_incorrectly() {

    }

}
