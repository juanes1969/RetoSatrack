package co.com.prueba.certificacion.retoSatrack.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferFoundsPage {

    public static final Target SELECT_FROM_ACCOUNT = Target.the("Select from account").located(By.id("fromAccount"));
    public static final Target SELECT_TO_ACCOUNT = Target.the("Select to account").located(By.id("toAccount"));
    public static final Target TRANSFER_AMOUNT = Target.the("Input transfer amount").located(By.id("transferAmount"));
    public static final Target BTN_TRANSFER = Target.the("Button transfer").located(By.id("transfer"));
    public static final Target MESSAGE_SUCCESS = Target.the("Message success").located(By.id("_ctl0__ctl0_Content_Main_postResp"));
}
