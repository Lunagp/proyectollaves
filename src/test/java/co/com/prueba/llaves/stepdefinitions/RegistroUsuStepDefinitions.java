package co.com.prueba.llaves.stepdefinitions;

import co.com.pruebas.llaves.models.RegisterUsu;
import co.com.pruebas.llaves.tasks.RegistroUsu;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroUsuStepDefinitions {


    @Before
    public void inicialize(){
        setTheStage(new OnlineCast());
    }
    @Given("^who enters the website and logs in \"([^\"]*)\"$")
    public void who_enters_the_website_and_logs_in(String arg1) {

    }


    @When("^register a manager type user with the following data$")
    public void register_a_manager_type_user_with_the_following_data(DataTable arg1) {

    }

    @Then("^you will see the successfully registered user on the screen$")
    public void you_will_see_the_successfully_registered_user_on_the_screen() {
    }


    /*@Before
    public void inicialize(){
        setTheStage(new OnlineCast());
    }
    @Given("who enters the website and logs in {string}")
    public void who_enters_the_website_and_logs_in(String url){
        Actor luna = Actor.named("luna");
        theActorCalled(String.valueOf(luna)).wasAbleTo(Open.url(url));
    }

    @When("register a manager type user with the following data")
    public void register_a_manager_type_user_with_the_following_data(List<RegisterUsu> registerList){
        RegisterUsu register;
        register = registerList.get(0);
        theActorInTheSpotlight().attemptsTo(RegistroUsu.registroU(register));
    }

    @Then("you will see the successfully registered user on the screen")
    public void you_will_see_the_successfully_registered_user_on_the_screen(){

    }*/

}
