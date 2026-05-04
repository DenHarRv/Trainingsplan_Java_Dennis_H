package Auto;

import java.util.Scanner;

public class Auto {

    Scanner leser = new Scanner(System.in);

    String marke;
    private double tankstand;
    private int geschwindigkeit;
    private boolean motorAn;

    public Auto (String marke) {
        this.marke = marke;
        this.tankstand = 25;
        this.geschwindigkeit = 0;
        this.motorAn = false;
    }

    //getter
    public double getTankstand() {return this.tankstand;}
    public int getGeschwindigkeit() {return this.geschwindigkeit;}
    public boolean getMotorAn() {return this.motorAn;}


    //Methode - Tanken
    public void tanken() {
        System.out.print("Wie viel möchten Sie tanken: ");
        double menge = leser.nextDouble();
        if(menge <= 0) {
            System.out.println("\nUngültige Menge! Du kannst nicht negativ tanken.");
            return;
        }
        double hinzugefuegterTank = 60 - this.tankstand;
        if (this.tankstand + menge >= 60) {
            //Tank wird überfüllt, stoppt jedoch, wenn 60l erreicht sind.
            System.out.printf("\nDer Tank ist voll, du hast %.2f Liter getankt.\n", hinzugefuegterTank);
            this.tankstand = 60;
        } else {
            //Tank wird nicht überfüllt.
            this.tankstand += menge;
            System.out.printf("\nDu hast nun %.2f Liter getankt. Dein Tank hat nun %.2f Liter Sprit.\n", menge, this.tankstand);
        }
    }

    //Methode - Motor an oder aus
    public void motorSchalten(){
        if (this.motorAn) {
            //Motor geht aus.
            System.out.println("Der Motor geht aus.");
            this.motorAn = false;
        } else {
            //Motor geht an.
            System.out.println("Der Motor springt an!");
            this.motorAn = true;
        }
    }

    //Methode - Gas geben
    public void gasGeben() {
        double beschleunigt = 0;
        System.out.print("Wie viel km/h möchten Sie beschleunigen: ");
        int beschleunigen = leser.nextInt();
        if (this.motorAn) {
            //Wenn der Motor an ist.
            if (this.tankstand > 0.00) {
                //Wenn noch etwas im Tank ist.
                if (this.geschwindigkeit + beschleunigen < 250) {
                    //Wenn die Geschwindigkeit gleich/unter 250 ist.
                    this.geschwindigkeit += beschleunigen;
                    System.out.println("\nSie fahren nun: " + this.geschwindigkeit + "km/h.");
                    beschleunigt = beschleunigen;
                    this.tankstand -= (beschleunigt / 10 * 0.5);
                } else {
                    //Wenn die max. Geschwindigkeit überschritten ist.
                    System.out.println("\nACHTUNG: Sie haben die Maximalgeschwindigkeit von 250km/h erreicht.");
                    beschleunigt = 250 - this.geschwindigkeit;
                    this.geschwindigkeit = 250;
                    this.tankstand -= (beschleunigt / 10 * 0.5);
                    }
            } else {
                //Wenn der tank leer ist.
                System.out.println("Du musst erst wieder tanken!");
            }
        } else {
            //Wenn der Motor aus ist.
            System.out.println("Sie müssen erst den Motor starten!");
        }
        if (this.tankstand <= 0) {
            System.out.println("Der Tank ist leer, das Auto geht aus und wird langsamer.");
            this.motorAn = false;
            this.tankstand = 0;
            this.geschwindigkeit = 0;
        }
    }

    //Methode - Gibt Status zum Auto wieder
    public void getStatus() {
        if (motorAn) {
        System.out.printf("Marke: %s | Tempo: %d | Tank: %.2f | Motor: an.\n", this.marke, this.geschwindigkeit, this.tankstand);
        } else {
            System.out.printf("Marke: %s | Tempo: %d | Tank: %.2f | Motor: aus.\n", this.marke, this.geschwindigkeit, this.tankstand);
        }
    }

    //Methode - Bremst das Auto auf 0km/h ab.
    public void bremsen() {
        System.out.println("Das Auto kommt erfolgreich zum Stehen.");
        this.geschwindigkeit = 0;
    }

}