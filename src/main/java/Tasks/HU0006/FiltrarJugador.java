package Tasks.HU0006;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0006.BotonesJugador.BUTTON_FILTRAR;
import static Userinterfaces.HU0006.BotonesJugador.FILTRO_NOMBRE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarJugador implements Task {

    public String Nombre;

    public FiltrarJugador(String Nombre) {
        this.Nombre = Nombre;}

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(FILTRO_NOMBRE),
                Enter.theValue(Nombre).into(FILTRO_NOMBRE),
                Click.on(BUTTON_FILTRAR));
    }
    public static FiltrarJugador ConNombre (String Nombre){
        return instrumented (FiltrarJugador.class, Nombre);}
}
