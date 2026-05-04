package Auto;

import java.util.Scanner;

public class AutoMenu {

    Scanner leser2 = new Scanner(System.in);
    String diesesAuto;


    public void autoBedienen(Auto diesesAuto) {
        boolean menu = true;
        do {
            //Das angezeigte Menü
            System.out.println("\n================================================================");
            diesesAuto.getStatus();
            System.out.println("================================================================");
            System.out.println("                       FAHRZEUG-STEUERUNG                       ");
            System.out.println("================================================================");
            System.out.println("[1] Motor starten / stoppen\n[2] Gas geben\n[3] Tanken\n[4] Vollbremsung (Stop)\n[5] Aussteigen (Beenden)");
            System.out.println("================================================================");
            System.out.print("Deine Wahl: ");

            //Hier wird geprüft, ob der User auch tatsächlich eine Zahl eingibt, damit das Programm nicht crasht
            while (!leser2.hasNextInt()) {
                System.out.println("FEHLER: Falscher Wert, bitte geben Sie eine gültige Zahl ein!");
                System.out.print("Deine Wahl: ");
                leser2.next();
            }
            int auswahl = leser2.nextInt();



            if (auswahl >= 1 && auswahl <= 5) {
                switch (auswahl) {
                    case 1: { //Motor an/aus
                        diesesAuto.motorSchalten();
                        break;
                    }
                    case 2: { //Gas geben
                        diesesAuto.gasGeben();
                        break;
                    }
                    case 3: { //Tanken
                        diesesAuto.tanken();
                        break;
                    }
                    case 4: { //Bremsen
                        diesesAuto.bremsen();
                        break;
                    }
                    case 5: { //Aussteigen/Ende
                        menu = false;
                        break;
                    }
                }
            } else {
                System.out.println("FEHLER! Falsche Eingabe, versuchen Sie es erneut.");
                continue;
            }

        } while (menu);
        System.out.println("Wir hoffen Ihre Fahrt war erfolgreich!");
    }
}
