package Kaffeeautomat;

public class Kaffeemaschine {

    String modell;
    private int wasserstand;
    String farbe;

    public Kaffeemaschine(String name) {
        this.modell = name;
        this.wasserstand = 0;
    }

    public Kaffeemaschine(int wasserstand) {
        this.modell = "Default";
        this.wasserstand = wasserstand;
    }

    public Kaffeemaschine(String name, String farbe) {
        this.modell = name;
        this.farbe = farbe;
    }
    
    public int getWasserstand() { return this.wasserstand;
    }

}
