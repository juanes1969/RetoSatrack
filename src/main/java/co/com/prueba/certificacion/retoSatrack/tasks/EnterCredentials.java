package co.com.prueba.certificacion.retoSatrack.tasks;

import co.com.prueba.certificacion.retoSatrack.models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.prueba.certificacion.retoSatrack.userinterfaces.HomePage.*;

public class EnterCredentials implements Task {

    private Credentials credentials;

    public EnterCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));
    }

    public static EnterCredentials EnterCredentials(Credentials credentials){

        return Tasks.instrumented(EnterCredentials.class, credentials);
    }
}
