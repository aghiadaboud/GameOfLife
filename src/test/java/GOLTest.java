import feld.Spielfeld;
import genaration.NeueGenerationRechner;
import org.junit.jupiter.api.Test;

public class GOLTest {


  @Test
  void methode1() {

    Spielfeld spielfeld = new Spielfeld(10, 10);
    var neueGenerationRechner = new NeueGenerationRechner();
    GOL gol = new GOL(spielfeld, 1, neueGenerationRechner);
  }

}
