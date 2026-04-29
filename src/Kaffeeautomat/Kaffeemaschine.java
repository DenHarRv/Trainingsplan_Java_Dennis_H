package Kaffeeautomat;

public class Kaffeemaschine {

    String modell;
    private int wasserstand;

    public Kaffeemaschine(String name) {
        this.modell = name;
        this.wasserstand = 0;
    }

    public int getWasserstand() { return this.wasserstand;}

    public void wasserEinfuellen(int menge) {
        if (this.wasserstand + menge >= 1000) {
            this.wasserstand = 1000;
            System.out.println("Achtung! Wassertank voll! Das restliche Wasser läuft über!");
        } else {
            this.wasserstand += menge;
            System.out.println("Wasser wurde aufgefüllt!");
        }
    }
}
