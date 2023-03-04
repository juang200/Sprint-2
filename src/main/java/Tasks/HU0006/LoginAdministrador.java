package Tasks.HU0006;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static Userinterfaces.HU0006.BotonesJugador.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginAdministrador implements Task {

    public String User;

    public String Password;

    public LoginAdministrador (String User, String Password){
        this.Password = Password;
        this.User = User;
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(INPUT_USUARIO),
                Enter.theValue(User).into(INPUT_USUARIO),
                Click.on(INPUT_CONTRASENA),
                Enter.theValue(Password).into(INPUT_CONTRASENA),
                Click.on(BUTTON_INGRESAR));
                try{
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static LoginAdministrador ConUsuario (String User, String Password){
        return instrumented (LoginAdministrador.class, User, Password);
    }


}
