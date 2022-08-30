package co.com.pruebas.llaves.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuariosHome {

    public static final Target USERNAME = Target.the("ingreso de username").located(By.xpath("//*[@type='userName']"));
    public static final Target PASSWORD = Target.the("ingreso de password").located(By.xpath("//*[@type='password']"));
    public static final Target BTN_ENTRY = Target.the("boton de ingreso").located(By.xpath("//*[@type='button ']"));


}
