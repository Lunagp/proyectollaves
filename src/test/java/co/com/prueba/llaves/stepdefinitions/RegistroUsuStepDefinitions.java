package co.com.prueba.llaves.stepdefinitions;

import co.com.pruebas.llaves.models.RegisterUsu;
import co.com.pruebas.llaves.tasks.RegistroUsu;
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
public class RegistroUsuStepDefinitions {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Luna");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^who enters the website and logs in \"([^\"]*)\"$")
    public void who_enters_the_website_and_logs_in(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^register a manager type user with the following data$")
    public void register_a_manager_type_user_with_the_following_data(List<RegisterUsu> registroList) {
        RegisterUsu registerUsu;
        registerUsu = registroList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroUsu.registroU(registerUsu));
    }

    @Then("^you will see the successfully registered user on the screen$")
    public void you_will_see_the_successfully_registered_user_on_the_screen() {
    }

}
