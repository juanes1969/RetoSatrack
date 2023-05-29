package co.com.prueba.certificacion.retoSatrack.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.prueba.certificacion.retoSatrack.userinterfaces.TransferFoundsPage.MESSAGE_SUCCESS;

public class ValidateSuccessMessage implements Question {

    private String message;

    public ValidateSuccessMessage(String message) {
        this.message = message;
    }

    @Override
    public Object answeredBy(Actor actor) {

        String messageReceived = Text.of(MESSAGE_SUCCESS).answeredBy(actor);

        return messageReceived.contains(message);
    }

    public static ValidateSuccessMessage ValidateSuccessMessage(String message) {
        return new ValidateSuccessMessage(message);
    }
}
