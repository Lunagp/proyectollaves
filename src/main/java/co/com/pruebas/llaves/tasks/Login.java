package co.com.pruebas.llaves.tasks;

import co.com.pruebas.llaves.models.Credentials;
import co.com.pruebas.llaves.userinterfaces.LlavesLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    Credentials credentials;

    public Login(Credentials credentials){
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUser()).into(LlavesLoginPage.TXT_USER));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LlavesLoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LlavesLoginPage.BTN_SUBMIT));
    }

    public static Login enter(Credentials credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }
}
