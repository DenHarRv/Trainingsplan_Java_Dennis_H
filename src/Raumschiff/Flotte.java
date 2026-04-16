package Raumschiff;

import java.util.Scanner;

public class Flotte {
    public static void main(String[] args) {

        Raumschiff raumschiff1 = new Raumschiff("X-Wing", 100, 15.5, 100);
        Raumschiff raumschiff2 = new Raumschiff("Tie-Fighter", 80, 12.0, 100);

        raumschiff1.triebwerkeStarten();
        raumschiff2.triebwerkeStarten();

        double gesamtSchaden = 0;

        Scanner leser = new Scanner(System.in);

        int laserSalven;

        while (true){
            System.out.print("Wie viele Laser-Salven soll der X-Wing abfeuern? (0 für Rückzug): ");
            laserSalven = leser.nextInt();
            if (laserSalven <= 0) {
                break;
            }
            gesamtSchaden += raumschiff1.feuern(raumschiff2, laserSalven);
        }
        System.out.printf("Mission beendet! Die Flotte hat %.2f Schaden angerichtet!", gesamtSchaden);
    }
}