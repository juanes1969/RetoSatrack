package co.com.prueba.certificacion.retoSatrack.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.prueba.certificacion.retoSatrack.userinterfaces.TransferFoundsPage.*;

public class SelectTransfersAccount implements Task {

    private String fromAccount;
    private String toAccount;
    private int amountToTransfer;

    public SelectTransfersAccount(String fromAccount, String toAccount, int amountToTransfer) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amountToTransfer = amountToTransfer;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byValue(fromAccount).from(SELECT_FROM_ACCOUNT));
        actor.attemptsTo(SelectFromOptions.byValue(toAccount).from(SELECT_TO_ACCOUNT));
        actor.attemptsTo(Enter.theValue(String.valueOf(amountToTransfer)).into(TRANSFER_AMOUNT));
        actor.attemptsTo(Click.on(BTN_TRANSFER));
    }

    public static SelectTransfersAccount SelectTransfersAccount(String fromAccount, String toAccount, int amountToTransfer) {

        return Tasks.instrumented(SelectTransfersAccount.class, fromAccount, toAccount, amountToTransfer);
    }
}
