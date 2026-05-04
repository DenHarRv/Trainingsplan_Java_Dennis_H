package Auto;

import java.util.Scanner;

public class Rennstrecke {
    public static void main(String[] args) {

        Scanner leser = new Scanner(System.in);

        //Hier wird das Auto erstellt, User kann Namen bestimmen:
        System.out.print("Welche Marken wollen Sie fahren (Name des Fahrzeugs eingeben): ");
        String autoName = leser.nextLine();
        Auto auto1 = new Auto(autoName);

        //Hier bereite ich autoBedienen für auto1 vor
        AutoMenu menu = new AutoMenu();

        //Nach einem Einleitungssatz wird hier die Menü Methode abgerufen
        System.out.printf("\nWillkommen auf der Teststrecke! Haben Sie schon Lust ihren %s auszuprobieren?\n", auto1.marke);
        menu.autoBedienen(auto1);
    }
}