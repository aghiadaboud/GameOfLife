package feld;

public class LebendigeZelle extends Zelle {

  private Zustand zustand = Zustand.LEBENDIG;

  public LebendigeZelle(int xKoordination, int yKoordination) {
    super(xKoordination, yKoordination);
  }
}
