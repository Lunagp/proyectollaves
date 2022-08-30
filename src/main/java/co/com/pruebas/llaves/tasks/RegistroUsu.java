package co.com.pruebas.llaves.tasks;

import co.com.pruebas.llaves.models.RegisterUsu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.pruebas.llaves.userinterfaces.RegistroUsuariosHome.BTN_ENTRY;
import static co.com.pruebas.llaves.userinterfaces.RegistroUsuariosHome.USERNAME;
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
        //actor.attemptsTo(Enter.theValue(registroUsu.getPassword()).into(PASSWORD));
        actor.attemptsTo(Click.on(BTN_ENTRY));
    }
}
