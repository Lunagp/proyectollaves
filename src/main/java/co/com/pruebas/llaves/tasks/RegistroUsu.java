package co.com.pruebas.llaves.tasks;

import java.awt.AWTException;

import co.com.pruebas.llaves.interaccion.Perfil;
import co.com.pruebas.llaves.models.RegisterUsu;
import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Enter.theValue(registroUsu.getUsername()).into(USERNAME));
        actor.attemptsTo(Enter.theValue(registroUsu.getPassword()).into(PASSWORD));
        actor.attemptsTo(Click.on(BTN_ENTRY));
        actor.attemptsTo(Click.on(BTN_MENU_USER));
        actor.attemptsTo(Click.on(BTN_REGISTERUSER));
        actor.attemptsTo(Enter.theValue(registroUsu.getName()).into(TXT_NAME));
        actor.attemptsTo(Enter.theValue(registroUsu.getLast()).into(TXT_LAST));
        actor.attemptsTo(Enter.theValue(registroUsu.getId()).into(TXT_ID));
        actor.attemptsTo(Enter.theValue(registroUsu.getCel()).into(TXT_CEL).thenHit(Keys.TAB, Keys.ENTER));
        try {
            StringSelection str = new StringSelection("C:\\Users\\ADMIN\\Downloads\\sampleFile (1).jpeg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
            Robot rb = new Robot();
            rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_V);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_V);
            rb.keyPress(KeyEvent.VK_ENTER);
            rb.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        actor.attemptsTo(Click.on(BTN_PERFILE));
        actor.attemptsTo(Click.on(BTN_PERFILE2));
        actor.attemptsTo(Enter.theValue(registroUsu.getNameusur()).into(TXT_NAMEUSUR));
        actor.attemptsTo(Enter.theValue(registroUsu.getEmail()).into(TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(registroUsu.getPasswordusur()).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_REGISTER));
        actor.attemptsTo(Click.on(BTN_REGISTER1));
        //actor.attemptsTo(Click.on(BTN_BURGER));
        //actor.attemptsTo(Click.on(BTN_MENU_USER));
    }

}
