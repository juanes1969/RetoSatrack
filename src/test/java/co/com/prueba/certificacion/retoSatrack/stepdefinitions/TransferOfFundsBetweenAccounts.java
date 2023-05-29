package co.com.prueba.certificacion.retoSatrack.stepdefinitions;

import co.com.prueba.certificacion.retoSatrack.models.Credentials;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.prueba.certificacion.retoSatrack.interactions.SelectTheOption.SelectTheOption;
import static co.com.prueba.certificacion.retoSatrack.questions.ValidateSuccessMessage.ValidateSuccessMessage;
import static co.com.prueba.certificacion.retoSatrack.tasks.EnterCredentials.EnterCredentials;
import static co.com.prueba.certificacion.retoSatrack.tasks.SelectTransfersAccount.SelectTransfersAccount;
import static co.com.prueba.certificacion.retoSatrack.utils.constants.Urls.demoTestFire;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class TransferOfFundsBetweenAccounts {

    @Given("That {word} is on the home page")
    public void thatJuanIsOnTheHomePage(String actor) {
        OnStage.theActorCalled(actor).wasAbleTo(Open.url(demoTestFire));
    }

    @Given("Select option {}")
    public void selectOptionSignIn(String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTheOption(option));
    }

    @When("Enter the credentials")
    public void enterTheCredentials(DataTable credentials) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentials(new Credentials(credentials)));
    }

    @When("Select the option {}")
    public void selectTheOptionTransferFunds(String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTheOption(option));
    }

    @When("Select the options {} {} and {}")
    public void selectTheOptionsCheckingCreditCardAnd(String from, String to, int amount) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTransfersAccount(from, to, amount));
    }

    @Then("Validate successful transfer between accounts for the requested amount with the following message {}")
    public void validateSuccessfulTransferBetweenAccountsForTheRequestedAmountWithTheFollowingMessageSuccessfullyTransferredFromAccount(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateSuccessMessage(message)));
    }
}
