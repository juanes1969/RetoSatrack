package co.com.prueba.certificacion.retoSatrack.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target LINKOPTION = Target.the("SingIn button").locatedBy("//a[contains(@id, '{0}')]");
    public static final Target USERNAME = Target.the("Username field").located(By.id("uid"));
    public static final Target PASSWORD = Target.the("Password field").located(By.id("passw"));
    public static final Target BTN_LOGIN = Target.the("Login button").located(By.name("btnSubmit"));
}
