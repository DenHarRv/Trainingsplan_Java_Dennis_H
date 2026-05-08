package Auto;

import java.util.Scanner;

public class Rennstrecke {
    public static void main(String[] args) {

        //Hier legen wir die Autos in der Garage fest
        Auto[] garage = new Auto[3];
        garage[0] = new Auto("Audi");
        garage[1] = new Auto("BMW");
        garage[2] = new Auto("VW");

        Scanner leser = new Scanner(System.in);
        int autoAuswahl = 0;
        do {
            //Aktuelle Autos in der Garage werden gelistet
            System.out.println("Aktuelle Autos in der Garage.");
            for (int i = 0; i < garage.length; i++) {
                System.out.println("Platz " + (i + 1) + ": ");
                garage[i].getStatus();
            }
            //User wählt eines der Autos aus
            System.out.print("\nWelches Auto wollen Sie fahren (1-3): ");
            autoAuswahl = leser.nextInt();
            if (autoAuswahl < 1 || autoAuswahl > garage.length) {
                System.out.println("\nFalsche Eingabe, bitte wählen Sie einen richtigen Wert.\n");
                continue;
            }
        } while (autoAuswahl < 1 || autoAuswahl > garage.length);
        autoAuswahl -= 1;


        //Hier bereite ich autoBedienen für das gewählte Auto vor
        AutoMenu menu = new AutoMenu();


        //Nach einem Einleitungssatz wird hier die Menü-Methode abgerufen
        System.out.printf("\nWillkommen auf der Teststrecke! Haben Sie schon Lust ihren %s auszuprobieren?\n", garage[autoAuswahl].marke);
        menu.autoBedienen(garage[autoAuswahl]);
    }
}