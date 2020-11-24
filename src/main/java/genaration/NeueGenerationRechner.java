package genaration;

import feld.LebendigeZelle;
import feld.ToteZelle;
import feld.Zelle;

public class NeueGenerationRechner {

  private Zelle[][] zellen;

  public Zelle[][] berechneNeueGeneration(final Zelle[][] zellen) {
    this.zellen = zellen;
    Zelle[][] neueGeneration = new Zelle[zellen.length][zellen[0].length];
    for (int i = 0; i < zellen.length; i++) {
      for (int j = 0; j < zellen[0].length; j++) {
        int lebendigeNachbarn = countLebendigeNachbarn(i, j);
        if (lebendigeNachbarn == 3) {
          neueGeneration[i][j] = new LebendigeZelle(i, j);
        } else if (zellen[i][j] instanceof LebendigeZelle
            && lebendigeNachbarn == 2) {
          neueGeneration[i][j] = new LebendigeZelle(i, j);
        } else {
          neueGeneration[i][j] = new ToteZelle(i, j);
        }
      }
    }
    return neueGeneration;
  }


  private int countLebendigeNachbarn(int i, int j) {
    return countLebendigeZellenNord(i - 1, j)
        + countLebendigeZellenNordWest(i - 1, j - 1)
        + countLebendigeZellenNordOst(i - 1, j + 1)
        + countLebendigeZellenSued(i + 1, j)
        + countLebendigeZellenSuedWest(i + 1, j - 1)
        + countLebendigeZellenSuedOst(i + 1, j + 1)
        + countLebendigeZellenWest(i, j - 1)
        + countLebendigeZellenOst(i, j + 1);
  }


  private boolean lebendigeZelle(int xKoordinate, int yKoordinate) {
    try {
      if (this.zellen[xKoordinate][yKoordinate] != null
          && this.zellen[xKoordinate][yKoordinate] instanceof LebendigeZelle) {
        return true;
      }
    } catch (ArrayIndexOutOfBoundsException exception) {
      //return ToteZelle.class;
    }
    return false;
  }

  private int countLebendigeZellenNord(int xKoordination, int yKoordination) {
    if (lebendigeZelle(xKoordination, yKoordination)) {
      return 1;
    }
    return 0;
  }

  private int countLebendigeZellenNordWest(int xKoordination, int yKoordination) {
    if (lebendigeZelle(xKoordination, yKoordination)) {
      return 1;
    }
    return 0;
  }

  private int countLebendigeZellenNordOst(int xKoordination, int yKoordination) {
    if (lebendigeZelle(xKoordination, yKoordination)) {
      return 1;
    }
    return 0;
  }


  private int countLebendigeZellenSued(int xKoordination, int yKoordination) {
    if (lebendigeZelle(xKoordination, yKoordination)) {
      return 1;
    }
    return 0;
  }

  private int countLebendigeZellenSuedWest(int xKoordination, int yKoordination) {
    if (lebendigeZelle(xKoordination, yKoordination)) {
      return 1;
    }
    return 0;
  }

  private int countLebendigeZellenSuedOst(int xKoordination, int yKoordination) {
    if (lebendigeZelle(xKoordination, yKoordination)) {
      return 1;
    }
    return 0;
  }


  private int countLebendigeZellenWest(int xKoordination, int yKoordination) {
    if (lebendigeZelle(xKoordination, yKoordination)) {
      return 1;
    }
    return 0;
  }

  private int countLebendigeZellenOst(int xKoordination, int yKoordination) {
    if (lebendigeZelle(xKoordination, yKoordination)) {
      return 1;
    }
    return 0;
  }

}
