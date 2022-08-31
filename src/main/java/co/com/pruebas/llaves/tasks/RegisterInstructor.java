package co.com.pruebas.llaves.tasks;

import co.com.pruebas.llaves.models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class RegisterInstructor implements Task {

    Credentials credentials;

    public RegisterInstructor(Credentials credentials){
        this.credentials = credentials;
    }

   public static RegisterInstructor inThePage( Credentials credentials){
return Tasks.instrumented(RegisterInstructor.class, credentials);
   }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
