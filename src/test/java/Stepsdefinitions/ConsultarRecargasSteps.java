package Stepsdefinitions;

import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ConsultarRecargasSteps {

    @Managed(driver = "Chorme")
    private WebDriver navegador;

    private Actor actor = Actor.named("Juan");


    @Then("^He goes to recharge module$")
    public void HeGoeToRechargeModule (){

    }

    // Filtrar recarga


}
