package co.com.pruebas.llaves.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuariosHome {

    public static final Target USERNAME = Target.the("ingreso de username").located(By.xpath("//*[@type='userName']"));
    public static final Target PASSWORD = Target.the("ingreso de password").located(By.xpath("//*[@type='password']"));
    public static final Target BTN_ENTRY = Target.the("boton de ingreso").located(By.xpath("//*[@type='button ']"));
    public static final Target BTN_MENU_USER = Target.the("ingresar al registro de usuarios").located(By.xpath("//*[@id='navegacion']/li[4]"));
    public static final Target BTN_REGISTERUSER = Target.the("boton registro de usuarios").located(By.xpath("//*[@id='app']/div[2]/main/div[2]/div/div[2]/div/div[1]/div/div/div/button"));
    public static final Target TXT_NAME = Target.the("Nombres registro de usuarios").located(By.xpath("//*[@placeholder='Nombres']"));
    public static final Target TXT_LAST = Target.the("Apellidos registro de usuarios").located(By.xpath("//*[@placeholder='Apellidos']"));
    public static final Target TXT_ID = Target.the("Id registro de usuarios").located(By.xpath("//*[@placeholder='Identificación']"));
    public static final Target TXT_CEL = Target.the("Celular registro de usuarios").located(By.xpath("//*[@placeholder='Telefono']"));
    public static final Target BTN_SELECTED = Target.the("Selecion de archivos registro de usuarios").located(By.xpath("//*[@id='app']/div[2]/main/div[2]/div/div[2]/div/div/div/div[2]/div/div[2]/div[5]"));
    public static final Target TXT_NAMEUSUR = Target.the("Nombre de usuario registro de usuarios").located(By.xpath("//*[@placeholder='Nombre de usuario']"));
    public static final Target TXT_EMAIL = Target.the("correo registro de usuarios").located(By.xpath("//*[@placeholder='Correo']"));
    public static final Target TXT_PASSWORD = Target.the("contraseña registro de usuarios").located(By.xpath("//*[@placeholder='Contraseña']"));
    public static final Target BTN_REGISTER = Target.the("boton registro de usuarios").located(By.xpath("//*[@class='btn btn-lg bg-gradient-primary btn-lg w-100 mt-4 mb-0 p-2']"));
    public static final Target BTN_REGISTER1 = Target.the("boton registro de usuarios").located(By.xpath("//button[contains(text(),'Aceptar')]"));
    public static final Target BTN_PERFILE = Target.the("despliegue de perfil registro de usuarios").located(By.xpath("//*[@class='form-select is-valid']"));
    public static final Target BTN_PERFILE1 = Target.the("despliegue1 de perfil registro de usuarios").located(By.xpath("//*[@value='1']"));
    public static final Target BTN_PERFILE2 = Target.the("despliegue2 de perfil registro de usuarios").located(By.xpath("//*[@value='2']"));
    public static final Target BTN_PERFILE3 = Target.the("despliegue3 de perfil registro de usuarios").located(By.xpath("//*[@value='3']"));
    public static final Target BTN_BURGER = Target.the("burger registro de usuarios").located(By.xpath("//*[@id='burger']"));

}
