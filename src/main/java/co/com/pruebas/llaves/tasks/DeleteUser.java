package co.com.pruebas.llaves.tasks;

import co.com.pruebas.llaves.models.Credentials;
import co.com.pruebas.llaves.userinterfaces.DeleteUserPage;
import co.com.pruebas.llaves.userinterfaces.LlavesLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DeleteUser implements Task {
    Credentials credentials;

    public DeleteUser(Credentials credentials){
        this.credentials = credentials;
    }
    public static DeleteUser inThePage(Credentials credentials){
        return Tasks.instrumented(DeleteUser.class, credentials);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUser()).into(LlavesLoginPage.TXT_USER));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LlavesLoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LlavesLoginPage.BTN_SUBMIT));
        actor.attemptsTo(Click.on(DeleteUserPage.BTN_USERS));
        actor.attemptsTo(Click.on(DeleteUserPage.BTN_DELETE));
        actor.attemptsTo(Click.on(DeleteUserPage.BTN_ACEPTAR));



    }
}
