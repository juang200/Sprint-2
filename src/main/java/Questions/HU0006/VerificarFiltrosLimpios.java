package Questions.HU0006;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0006.BotonesJugador.VERIF_FILTROS_LIMPIOS_J;

public class VerificarFiltrosLimpios implements Question {

    private final String MensajeInfo;

    public VerificarFiltrosLimpios(String MensajeInfo){
            this.MensajeInfo = MensajeInfo;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIF_FILTROS_LIMPIOS_J).viewedBy(actor).asString().equals(MensajeInfo.toString()))
            return true;
        else
            return false;
        }

        public static VerificarFiltrosLimpios Validcleanfilter (String MensajeInfo){
        return new VerificarFiltrosLimpios(MensajeInfo);
        }
}
