package feld;

public class ToteZelle extends Zelle {

  private Zustand zustand = Zustand.TOT;

  public ToteZelle(int xKoordination, int yKoordination) {
    super(xKoordination, yKoordination);
  }
}
