package Questions.HU0006;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0006.BotonesJugador.VERIF_MAS_FILTROS;

public class VerMasFiltros implements Question {

    private final String MasFiltros;

    public VerMasFiltros (String MasFiltros){
        this.MasFiltros = MasFiltros;
    }

    @Override
    public Object answeredBy (Actor actor){
        if (Text.of(VERIF_MAS_FILTROS).viewedBy(actor).asString().equals(MasFiltros.toString()))
            return true;
        else
            return false;
    }

    public static VerMasFiltros Filtros (String Masfiltros){
        return new VerMasFiltros(Masfiltros);
    }
}
