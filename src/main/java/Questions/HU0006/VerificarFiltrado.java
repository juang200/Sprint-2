package Questions.HU0006;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0006.BotonesJugador.VERIF_FILTRADO_J;

public class VerificarFiltrado implements Question {

    private final String Documento;

    public VerificarFiltrado (String Documento){
        this.Documento = Documento;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIF_FILTRADO_J).viewedBy(actor).asString().equals(Documento.toString()))
            return true;
        else
            return false;
    }

    public static VerificarFiltrado ValidFilter (String Documento){
        return new VerificarFiltrado(Documento);
    }

}
