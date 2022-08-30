package co.com.pruebas.llaves.tasks;

import co.com.pruebas.llaves.models.RegisterUsu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.awt.*;

import static co.com.pruebas.llaves.userinterfaces.RegistroUsuariosHome.*;
import static java.awt.Event.ENTER;
import static java.awt.Event.TAB;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroUsu implements Task {
    RegisterUsu registroUsu;

    public RegistroUsu(RegisterUsu registroUsu) {
        this.registroUsu = registroUsu;
    }

    public static RegistroUsu registroU(RegisterUsu registroUsu){
        return instrumented(RegistroUsu.class, registroUsu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registroUsu.getUsername()).into(USERNAME));
        actor.attemptsTo(Enter.theValue(registroUsu.getPassword()).into(PASSWORD));
        actor.attemptsTo(Click.on(BTN_ENTRY));
        actor.attemptsTo(Click.on(BTN_MENU_USER));
        actor.attemptsTo(Click.on(BTN_REGISTERUSER));
        actor.attemptsTo(Enter.theValue(registroUsu.getName()).into(TXT_NAME));
        actor.attemptsTo(Enter.theValue(registroUsu.getLast()).into(TXT_LAST));
        actor.attemptsTo(Enter.theValue(registroUsu.getId()).into(TXT_ID));
        actor.attemptsTo(Enter.theValue(registroUsu.getCel()).into(TXT_CEL));
        actor.attemptsTo(Scroll.to(BTN_SELECTED));
        actor.attemptsTo(Enter.theValue(registroUsu.getNameusur()).into(TXT_NAMEUSUR));
        actor.attemptsTo(Enter.theValue(registroUsu.getEmail()).into(TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(registroUsu.getPasswordusur()).into(TXT_PASSWORD));






    }
}
