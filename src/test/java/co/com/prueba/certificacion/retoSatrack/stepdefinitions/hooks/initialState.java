package co.com.prueba.certificacion.retoSatrack.stepdefinitions.hooks;


import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class initialState {


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
    }

}
