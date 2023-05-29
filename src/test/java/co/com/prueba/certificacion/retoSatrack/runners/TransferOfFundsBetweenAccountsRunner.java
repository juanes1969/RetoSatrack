package co.com.prueba.certificacion.retoSatrack.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/transfer_of_funds_between_accounts.feature",
                 glue = "co.com.prueba.certificacion.retoSatrack.stepdefinitions" ,
                 snippets = CucumberOptions.SnippetType.CAMELCASE)
public class TransferOfFundsBetweenAccountsRunner {

}
