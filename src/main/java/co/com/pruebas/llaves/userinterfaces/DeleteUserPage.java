package co.com.pruebas.llaves.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeleteUserPage {

    public static final Target BTN_USERS = Target.the("botón opción usuarios").located(By.xpath("//li[4][@class='nav-item']"));
    public static final Target TXT_NAMEUSER = Target.the("Nombre de usuario").located(By.xpath("//*[@id=\"app\"]/div[2]/div/table/tbody/tr[1]/td[1]/div/div/p"));
    public static final Target BTN_DELETE = Target.the("botón eliminar usuario").located(By.xpath("//div[@tooltip='Eliminar zona']"));
    public static final Target BTN_ACEPTAR = Target.the("Botón para aceptar").located(By.xpath("//button[contains(text(),'Aceptar')]"));
}
