package co.com.prueba.certificacion.retoSatrack.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.prueba.certificacion.retoSatrack.userinterfaces.HomePage.LINKOPTION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectTheOption implements Interaction {

    private String option;

    public SelectTheOption(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(LINKOPTION.of(option), isVisible()).forNoMoreThan(3).seconds());
        actor.attemptsTo(Click.on(LINKOPTION.of(option)));

    }

    public static SelectTheOption SelectTheOption(String option) {
        return Tasks.instrumented(SelectTheOption.class, option);
    }
}
