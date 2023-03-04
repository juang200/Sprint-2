package Tasks.HU0006;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0006.BotonesJugador.BUTTON_FILTRAR;
import static Userinterfaces.HU0006.BotonesJugador.FILTRO_CORREO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarJugadorNoExiste implements Task {

    public String Email;

    public FiltrarJugadorNoExiste(String Email){
        this.Email = Email;
    }


    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(FILTRO_CORREO),
                Enter.theValue(Email).into(FILTRO_CORREO),
                Click.on(BUTTON_FILTRAR));
    }

    public static FiltrarJugadorNoExiste ConDato (String Email){
        return instrumented (FiltrarJugadorNoExiste.class, Email);
    }

}


