package Kaffeeautomat;

public class Kaffeemaschine {

    String modell;
    private int wasserstand;
    String farbe;

    public Kaffeemaschine(String name) {
        this.modell = name;
        this.wasserstand = 0;
    }

    public int getWasserstand() { return this.wasserstand;
    }

    public void wasserEinfuellen(int menge) {

    }
}
