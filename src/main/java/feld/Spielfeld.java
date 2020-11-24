package feld;

import genaration.NeueGenerationRechner;

public class Spielfeld {

  private final int xAchse;
  private final int yAchse;
  private Zelle[][] zellen;


  public Spielfeld(int xAchse, int yAchse) {
    this.xAchse = xAchse;
    this.yAchse = yAchse;
    erzeugeFeld();
  }

  private void erzeugeFeld() {
    this.zellen = new Zelle[xAchse][yAchse];
    for (int i = 0; i < xAchse; i++) {
      for (int j = 0; j < yAchse; j++) {
        zellen[i][j] = new ToteZelle(i, j);
      }
    }
  }

  public void updateZellenZustand(NeueGenerationRechner neueGenerationRechner) {
    Zelle[][] neueGeneration = neueGenerationRechner.berechneNeueGeneration(this.zellen);
    for (int i = 0; i < xAchse; i++) {
      this.zellen[i] = neueGeneration[i].clone();
    }
  }

  public void machLeben(int anfangsGeneration) {
    int xKoordination = xAchse / 2;
    int yKoordination = yAchse / 2;
    while (anfangsGeneration != 0) {
      if (toteZelle(xKoordination, yKoordination)) {
        this.zellen[xKoordination][yKoordination] =
            new LebendigeZelle(xKoordination, yKoordination);
        anfangsGeneration--;
      }
      xKoordination = randomKoordinate(xKoordination);
      yKoordination = randomKoordinate(yKoordination);
    }
  }

  private int randomKoordinate(int koordination) {
    double random = Math.random();
    if (random < 0.33) {
      koordination--;
    } else if (random >= 0.33 && random < 0.66) {
      koordination++;
    }
    if (koordination < 0) {
      koordination *= -1;
    }
    return koordination;
  }


  private boolean toteZelle(int xKoordinate, int yKoordinate) {
    return (xKoordinate < xAchse && yKoordinate < yAchse
        && this.zellen[xKoordinate][yKoordinate] instanceof ToteZelle);
  }

  public boolean mindestensEineZelleLebendig() {
    for (int i = 0; i < xAchse; i++) {
      for (int j = 0; j < yAchse; j++) {
        if (zellen[i][j] instanceof LebendigeZelle) {
          return true;
        }
      }
    }
    return false;
  }

  public void print() {
    for (int i = 0; i < xAchse; i++) {
      for (int j = 0; j < yAchse; j++) {
        if (this.zellen[i][j] instanceof LebendigeZelle) {
          System.out.print("(#)");
        } else {
          System.out.print("( )");
        }
      }
      System.out.println();
    }
  }
}
