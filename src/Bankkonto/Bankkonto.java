package Bankkonto;

public class Bankkonto {

    String kundenName;
    private double kontostand;

    //Konstruktor
    public Bankkonto(String kundenName, double kontostand) {
        this.kundenName = kundenName;
        this.kontostand = kontostand;
    }

    //Getter
    public double getKontostand() {
        return this.kontostand;
    }

    //Setter
    public void abheben(double betrag) {
        if (betrag <= this.kontostand) {
            this.kontostand -= betrag;
            System.out.printf("Erfolgreich %.2f Euro abgehoben. Neuer Stand: %.2f Euro.\n", betrag, this.kontostand);
        } else {
            System.out.println("Abbruch! Nicht genügen Guthaben auf dem Konto.");
        }
    }

    public void einzahlen(double betrag) {
        if (betrag > 5) {
            this.kontostand += betrag;
            System.out.printf("Du hast erfolgreich %.2f Euro eingezahlt. Neuer Kontostand: %.2f Euro!\n", betrag, this.kontostand);
        } else {
            System.out.println("Falscher Wert! Es müsseb mindestens 5,00 Euro eingezahlt werden.");
        }
    }
}
