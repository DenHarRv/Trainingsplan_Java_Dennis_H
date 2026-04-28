package Bankkonto;

public class Bankkonto {

    String kundenName;
    private double kontostand;

    //Konstruktor
    public Bankkonto(String kundenName, double ersteinzahlung) {
        this.kundenName = kundenName;
        this.einzahlen(ersteinzahlung);
    }

    //Getter
    public double getKontostand() {
        return this.kontostand;
    }


    public void abheben(double betrag) {
        if (betrag <= this.kontostand) {
            this.kontostand -= betrag;
            System.out.printf("Erfolgreich %.2f Euro abgehoben. Neuer Stand: %.2f Euro.\n", betrag, this.kontostand);
        } else {
            System.out.println("Abbruch! Nicht genügend Guthaben auf dem Konto.");
        }
    }

    public void einzahlen(double betrag) {
        if (betrag > 5) {
            this.kontostand += betrag;
            System.out.printf("Du hast erfolgreich %.2f Euro eingezahlt. Neuer Kontostand: %.2f Euro!\n", betrag, this.kontostand);
        } else {
            System.out.println("Falscher Wert! Es müssen mindestens 5,00 Euro eingezahlt werden.");
        }
    }
}
