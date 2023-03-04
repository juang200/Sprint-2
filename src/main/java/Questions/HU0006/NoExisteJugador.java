package Questions.HU0006;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static Userinterfaces.HU0006.BotonesJugador.JUGADOR_NO_EXISTE;

public class NoExisteJugador implements Question {

        private final String JugadorNoExiste;

        public NoExisteJugador(String JugadorNoExiste){
            this.JugadorNoExiste = JugadorNoExiste;
        }


        @Override
        public Object answeredBy  (Actor actor){
            if (Text.of(JUGADOR_NO_EXISTE ).viewedBy(actor).asString().equals(JugadorNoExiste.toString()))
                return true;
            else
                return false;
        }

        public static NoExisteJugador NoExiste (String JugadorNoExiste){
            return new NoExisteJugador(JugadorNoExiste);
        }
}
