package co.com.pruebas.llaves.questions;


import co.com.pruebas.llaves.userinterfaces.DeleteUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyDeleteUser implements Question {

    public static VerifyDeleteUser inThePge(){
        return new VerifyDeleteUser();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(DeleteUserPage.TXT_NAMEUSER).viewedBy(actor).asString();

    }


}
