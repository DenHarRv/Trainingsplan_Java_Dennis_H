import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner automat = new Scanner(System.in);
        boolean alterskontrolle = true;
        int filmAuswahl = 0;
        int alter = 0;
        String avengers = "The Avengers: Endgame";
        String biest = "Die Schöne und das Biest";
        String saw = "SAW 6";

        while (alterskontrolle){
            //Begruessung am Automat + Filmauswahl;
            System.out.println("Willkommen im Burg-Kino in Ravensburg, bitte wählen Sie mit der entsprechenden Ziffer Ihren gewünschten Film.");
            System.out.println("_____________________________________________");
            System.out.println("[1] " + avengers + " [FSK 12]");
            System.out.println("[2] " + biest + " [FSK 0]");
            System.out.println("[3] " + saw + " [FSK 18]");
            System.out.println("_____________________________________________");
            System.out.print("Wählen Sie mit der entsprechenden Ziffer:   ");
            filmAuswahl = automat.nextInt();

            //Altersabfrage;
            System.out.print("\nSehr schön, Sie haben sich für ");
            switch (filmAuswahl) {
                case 1:
                    System.out.print(avengers + " entschieden. Aufgrund der FSK müssen wir iher Alter prüfen, wie alt sind Sie? ");
                    alter = automat.nextInt();
                    if (alter >= 12) {
                        System.out.println("\nSie sind alt genug um den Film anzuschauen.");
                        alterskontrolle = false;
                    } else {
                        System.out.println("\nTut mir leid, Sie sind zu jung für diesen Film, bitte wählen Sie einen anderen Film aus.");
                        continue;
                    }
                    break;

                case 2:
                    System.out.println(biest + " entschieden.");
                    alterskontrolle = false;
                    break;

                case 3:
                    System.out.print(saw + " entschieden. Aufgrund der FSK müssen wir iher Alter prüfen, wie alt sind Sie? ");
                    alter = automat.nextInt();
                    if (alter >= 18) {
                        System.out.println("\nSie sind alt genug um den Film anzuschauen.");
                        alterskontrolle = false;
                    } else {
                        System.out.println("\nTut mir leid, Sie sind zu jung für diesen Film, bitte wählen Sie einen anderen Film aus.");
                        continue;
                    }
                    break;
            }  //Switch filmAuswahl endet;
        } //while alterkontrolle endet;

        //Ist die Person alt genug, geht es weiter, ist sie zu jung, beendet hier das Programm und würde wieder am Start beginnen.;
        boolean student = false;
        double studentenRabatt = 2.50;

        if (alter != 0) {
            if (alter <29) {
                System.out.print("Schüler und Studenten bis einschließlich 28 Jahren erhalten Studentenrabatt. Sind Sie Schüler oder Student? (true/false): ");
                student = automat.nextBoolean();
                if (student) {
                    System.out.println("\nSie erhalten Schüler-/Studentenrabatt von " + studentenRabatt + "€.");
                } else {
                    System.out.println("\nSie erhalten leider keinen Schüler-/Studentenrabatt.");
                }
            } else {

            }
        } else {
            System.out.print("Wie alt sind sie? ");
            alter = automat.nextInt();
            if (alter <29) {
                System.out.println("\nWenn Sie Schüler oder Student sind, erhalten Sie bis einschließlich 28 Jahren " + studentenRabatt + "€ Rabatt.");
                System.out.print("Sind Sie Schüler oder Student (true/false)? ");
                student = automat.nextBoolean();
                if (student) {
                    System.out.println("\nSie erhalten Schüler-/Studentenrabatt von " + studentenRabatt + "€.");
                } else {
                    System.out.println("\nSie erhalten leider keinen Schüler-/Studentenrabatt.");
                }
            } else {
                System.out.println("\nTut mir leid, dann sind Sie leider nicht alt genug für den Schüler oder Schüler-/Studentenbabatt.");
            }
        }

        //Hier wird noch gefragt, in welchem Teil die Sitze gewünscht sind und entsprechend wird der Preis des Grundticket angepasst;
        double ticketpreis = 0;
        double vorderesAbteilPreis = 12.50;
        double hinteresAbteilPreis = 14.50;

        System.out.println("\nWo wünschen Sie zu sitzn? Wählen Sie mit entsprechender Ziffer ihren Sitzplatz:");
        System.out.println("______________________________________________");
        System.out.println("[1] Vorderes Abteil - " + vorderesAbteilPreis + "€.");
        System.out.println("[2] Hinteres Abteil - " + hinteresAbteilPreis + "€.");
        System.out.println("_____________________________________________");
        System.out.print("Bitte wählen Sie:                           ");
        int sitzplatz = automat.nextInt();
        System.out.print("\nSie wählten ");
        switch (sitzplatz) {
            case 1: System.out.println("vorderes Abteil.");
            ticketpreis = vorderesAbteilPreis;
            break;
            case 2: System.out.println("hinteres Abteil.");
            ticketpreis = hinteresAbteilPreis;
            break;
        } //switch sitzplatz endet;

        //Hier kann sich der Kunde noch Snacks und Drinks aussuchen;
        double snackPreis = 0;
        double colaKleinPreis = 2.50;
        double colaMittelPreis = 3.50;
        double colaGrossPreis = 4.50;
        double popcornKleinPreis = 4.00;
        double popcornMittelPreis = 5.00;
        double popcornGrossPreis = 6.00;
        //Hier sind die Preise der Produkte, sie sind verstellbar;

        boolean snackauswahl = true;

        //Hierher kommt der Kunde zurück, wenn er ein Produkt auswählt, bis er die 7 wählt.;
        System.out.println("Darf es zum Film noch etwas Popcorn und/oder Cola sein?");

        while (snackauswahl) {
            System.out.println("Mit der entsprechenden Zahl fügen Sie ein Produkt hinzu oder gehen weiter.");
            System.out.println("_____________________________________________");
            System.out.println("[1] Cola klein");
            System.out.println("[2] Cola mittel");
            System.out.println("[3] Cola groß");
            System.out.println("[4] Popcorn klein");
            System.out.println("[5] Popcorn mittel");
            System.out.println("[6] Popcorn groß");
            System.out.println("[7] Fertig!");
            System.out.println("_____________________________________________");
            System.out.print("Bitte wählen Sie ein Produkt:               ");
            int snackProdukt = automat.nextInt();

            switch (snackProdukt) {
                case 1: System.out.println("\nSie wählten Cola klein für " + colaKleinPreis + "€.\n");
                snackPreis = ( snackPreis + colaKleinPreis );
                continue;
                case 2: System.out.println("\nSie wählten Cola mitteln für " + colaMittelPreis + "€.\n");
                snackPreis = ( snackPreis + colaMittelPreis );
                continue;
                case 3: System.out.println("\nSie wählten Cola groß für " + colaGrossPreis + "€.\n");
                snackPreis = ( snackPreis + colaGrossPreis );
                continue;
                case 4: System.out.println("\nSie wählten Popcorn klein für " + popcornKleinPreis + "€.\n");
                snackPreis = ( snackPreis + popcornKleinPreis );
                continue;
                case 5: System.out.println("\nSie wählten Popcorn mittel für " + popcornMittelPreis + "€.\n");
                snackPreis = ( snackPreis + popcornMittelPreis );
                continue;
                case 6: System.out.println("\nSie wählten Popcorn groß für " + popcornGrossPreis + "€.\n");
                snackPreis = ( snackPreis + popcornGrossPreis );
                continue;
                case 7:
                snackauswahl = false;
                break;
            } //Hier endet der switch snackprodukt;
        } //Hier endet while snackautomat;

        // Ab hier wird der Bon zusammengestellt und die Rechnung dem Kunde gezeigt.
        ticketpreis = (ticketpreis + snackPreis);
        if (student) {
            ticketpreis = (ticketpreis - studentenRabatt);
        } else {
        }
        System.out.print("\nDie Rechnung beträgt " + ticketpreis + "€. Wir wünschen Ihnen viel Spaß im Burgkino im Film " );
        switch (filmAuswahl) {
            case 1: System.out.print(avengers + ".");
            break;
            case 2: System.out.print(biest + ".");
            break;
            case 3: System.out.print(saw + ".");
            break;
        }
    }
}