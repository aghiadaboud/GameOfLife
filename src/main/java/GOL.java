//@SuppressWarnings("checkstyle:abbreviationaswordinname")

import feld.Spielfeld;
import genaration.NeueGenerationRechner;

@SuppressWarnings({"PMD.ShortClassName", "PMD.AtLeastOneConstructor", "PMD.LoosePackageCoupling",
    "PMD.NoPackage"})
//Game Of Life
public class GOL {

  private final int anfangsGeneration;
  private Spielfeld spielfeld;
  private NeueGenerationRechner neueGenerationRechner;

  public GOL(Spielfeld spielfeld, int anfangsGeneration,
             NeueGenerationRechner neueGenerationRechner) {
    this.spielfeld = spielfeld;
    this.anfangsGeneration = anfangsGeneration;
    this.neueGenerationRechner = neueGenerationRechner;
  }

  public static void main(String[] args) {
    var spielfeld = new Spielfeld(4, 4);
    GOL gol = new GOL(spielfeld, 3, new NeueGenerationRechner());
    gol.run();
  }

  public void run() {
    spielfeld.machLeben(anfangsGeneration);
    spielfeld.print();
    while (spielfeld.mindestensEineZelleLebendig()) {
      spielfeld.updateZellenZustand(this.neueGenerationRechner);
      System.out.println("============================");
      spielfeld.print();
    }
  }
}