package co.com.pruebas.llaves.interaccion;

import co.com.pruebas.llaves.models.RegisterUsu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pruebas.llaves.userinterfaces.RegistroUsuariosHome.*;

public class Perfil implements Interaction{

    RegisterUsu registerUsu;

    public Perfil(RegisterUsu registerUsu) {
        this.registerUsu = registerUsu;
    }

    public static Perfil perfiles(RegisterUsu registerUsu){
        return Tasks.instrumented(Perfil.class, registerUsu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(registerUsu.getPerfil().contains("1")){
            actor.attemptsTo(Click.on(BTN_PERFILE1));
        }if(registerUsu.getPerfil().contains("2")){
            actor.attemptsTo(Click.on(BTN_PERFILE2));
        }if(registerUsu.getPerfil().contains("3")){
            actor.attemptsTo(Click.on(BTN_PERFILE3));
        }
    }
}
