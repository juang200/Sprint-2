package Stepsdefinitions;

import Questions.HU0006.*;
import Tasks.HU0006.FiltrarJugador;
import Tasks.HU0006.FiltrarJugadorNoExiste;
import Tasks.HU0006.LoginAdministrador;
import Userinterfaces.HU0006.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static Userinterfaces.HU0006.BotonesJugador.*;

public class DetalleJugadorSteps {

    @Managed (driver = "Chrome")
    private WebDriver Navegador;

    private HomePage homepage = new HomePage();

    private Actor actor = Actor.named("Juan");


// Ingreso a la pagina principal de Neat

    @Given("^The User enters to the Neat administrative page$")
    public void theUserEntersToTheNeatAdministrativePage (){
        actor.can(BrowseTheWeb.with(Navegador));
        actor.wasAbleTo(Open.browserOn(homepage));
        Navegador.manage().window().maximize();}

    @When("^He puts the (.*) and the (.*)$")
    public void hePutsTheAdminOperatorAndTheAdmin (String User, String Password){
        actor.attemptsTo(
                LoginAdministrador.ConUsuario(User, Password));
    }

    @Then("^He goes to the general player detail module$")
    public void heGoesToTheGeneralPlayerDetailModule (){
        actor.attemptsTo(
                Click.on(ICONO_JUGADOR),
                Scroll.to(DETTALLE_COMPLETO),
                Click.on(DETTALLE_COMPLETO));
    }

    // Filtrar Jugador

    @Given("^He puts the name user (.*) in the Input$")
    public void He_puts_the_name_user_in_the_Input (String Nombre){
        actor.attemptsTo(
                FiltrarJugador.ConNombre(Nombre));
    }

    @Then("^He sees the player information (.*)$")
    public void He_sees_the_player_information (String Documento){
        actor.should(GivenWhenThen.seeThat(VerificarFiltrado.ValidFilter(Documento)));
    }


    //Limpiar Filtros

    @When("^He select the Clean filters button$")
    public void He_select_the_Clean_filters_button (){
        actor.attemptsTo(
                Click.on(BUTTON_LIMPIAR));
    }

    @Then("^He sees the principal page (.*)$")
    public void He_sees_the_principal_page (String MensajeInfo){
        actor.should(GivenWhenThen.seeThat(VerificarFiltrosLimpios.Validcleanfilter(MensajeInfo)));
    }


    // Ver mas filtros

    @Given("^He select the Button more filters$")
    public void He_select_the_Button_more_filters (){
        actor.attemptsTo(
                Click.on(MAS_FILTROS_BUTTON)
        );}

    @Then("^He sees all the filters options (.*)$")
    public void He_sees_all_the_filters_options (String MasFiltros){
        actor.should(GivenWhenThen.seeThat(VerMasFiltros.Filtros(MasFiltros)));
    }


    // Ver mas opciones para detalle Jugador

    @Given("^He select the more options button$")
    public void He_select_the_more_options_button (){
        actor.attemptsTo(
                Click.on(MAS_OPCIONES_BUTTON));
    }

    @Then("^He sees all the player detail options (.*)$")
    public void He_sees_all_the_player_detail_options (String MasOpciones){
        actor.should(GivenWhenThen.seeThat(VerMasOpciones.VerOpciones(MasOpciones)));
    }

   //Filtrar jugador no existente

   @Given("^He filter a player wiht the emial (.*)$")
   public void He_filter_a_player_wiht_the_emial (String Email){
        actor.attemptsTo(
                FiltrarJugadorNoExiste.ConDato(Email));
   }

   @Then("^He sees the advertaicing message (.*)$")
   public void He_sees_the_advertaicing_message (String JugadorNoExiste){
        actor.should(GivenWhenThen.seeThat(NoExisteJugador.NoExiste(JugadorNoExiste)));

   }











}
