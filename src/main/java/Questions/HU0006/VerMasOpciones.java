package Questions.HU0006;

import cucumber.api.java.pt.Mas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0006.BotonesJugador.VERIF_MAS_OPCIONES;

public class VerMasOpciones implements Question {

    private final String MasOpciones;

    public VerMasOpciones (String MasOpciones){
        this.MasOpciones = MasOpciones;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIF_MAS_OPCIONES).viewedBy(actor).asString().equals(MasOpciones.toString()))
            return true;
        else
            return false;
    }

    public static VerMasOpciones VerOpciones (String MasOpciones){
        return new VerMasOpciones(MasOpciones);
    }
}
