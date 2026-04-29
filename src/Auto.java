public class Auto {

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

    public void tanken(double menge) {
        if(menge <= 0) {
            System.out.println("Ungültige Menge! Du kannst nicht negativ tanken.");
            return;
        }
        double hinzugefuegterTank = 60 - this.tankstand;
        if (this.tankstand + menge >= 60) {
            //Tank wird überfüllt, stoppt jedoch, wenn 60l erreicht sind.
            System.out.printf("Der Tank ist voll, du hast %.2f Liter getankt.\n", hinzugefuegterTank);
            this.tankstand = 60;
        } else {
            //Tank wird nicht überfüllt.
            this.tankstand += menge;
            System.out.printf("Du hast nun %.2f Liter getankt. Dein Tank hat nun %.2f Liter Sprit.\n", menge, this.tankstand);
        }
    }

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
// WICHTIG: REGEL 4 noch einbauen, pro 10km/h beschleunigung verbraucht das Auto 0.5 L Benzin
    public void gasGeben(int beschleunigen) {
        if (this.motorAn) {
            //Wenn der Motor an ist.
            if (this.tankstand > 0.00) {
                //Wenn noch etwas im Tank ist.
                if (this.geschwindigkeit + beschleunigen <= 250) {
                    //Wenn die Geschwindigkeit gleich/unter 250 ist.
                    this.geschwindigkeit += beschleunigen;
                    System.out.println("Sie fahren nun: " + this.geschwindigkeit + "km/h.");
                    break;
                } else {
                    //Wenn die max. Geschwindigkeit überschritten ist.
                    System.out.println("ACHTUNG: Sie haben die Maximalgeschwindigkeit von 250km/h erreicht.");
                    this.geschwindigkeit = 250;
                    break;
                    }
            } else {
                //Wenn der tank leer ist.
                System.out.println("Du musst erst wieder tanken!");
                break;
            }
        } else {
            //Wenn der Motor aus ist.
            System.out.println("Sie müssen erst den Motor starten!");
            break;
        }

    }
}
