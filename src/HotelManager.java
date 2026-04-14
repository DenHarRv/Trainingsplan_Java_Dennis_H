import java.util.Scanner;

public class HotelManager {
    public static void main(String[] args) {

        String[][] hotel = new String[4][5];

        //Alle Zimmer als frei setzen
        for (int etage = 0; etage < hotel.length; etage++) {
            for (int zimmer = 0; zimmer < hotel[etage].length; zimmer++) {
                hotel[etage][zimmer] = "FREI ";
            }
        }
        hotel[0][0] = "       "; hotel[0][1] = "Zimmer 1 "; hotel[0][2] = "Zimmer 2 "; hotel[0][3] = "Zimmer 3 "; hotel[0][4] = "Zimmer 4";
        hotel[1][0] = "Etage 1";
        hotel[2][0] = "Etage 2";
        hotel[3][0] = "Etage 3";

        //Aktuelle Zimmerbelegung
        System.out.println("Die aktuelle Zimmerbelegung: \n");
        for (int etage = 0; etage < hotel.length; etage++) {
            for (int zimmer = 0; zimmer < hotel[etage].length; zimmer++) {
                System.out.print(hotel[etage][zimmer] + " ");
            }
            System.out.print("\n");
        }

        Scanner leser = new Scanner(System.in);

        String nameGast = "";
        while (!nameGast.equalsIgnoreCase("ende")) {

            do {
                System.out.print("\nGeben Sie den Name des Gasts ein oder schließen Sie den Tag mit \"Ende\" ab: ");
                nameGast = leser.nextLine();
                if (nameGast.length() <= 3) {
                    System.out.println("Fehler: Der Name muss länger als 3 Zeichen sein!");
                }
            } while (nameGast.length() <= 3);

            if (nameGast.equalsIgnoreCase("ende")) break;
            int etageGast;
            int zimmerGast;
            do {
                System.out.print("Auf welche Etage kommt besagter Gast (1-3): ");
                etageGast = leser.nextInt();
                System.out.print("Auf welches Zimmer kommt besagter Gast(1-4): ");
                zimmerGast = leser.nextInt();
                leser.nextLine();
                if (etageGast < 1 || etageGast > 3 || zimmerGast < 1 || zimmerGast > 4 ) {
                    System.out.println("Fehler: Bitte wählen Sie für die Etage und das Zimmer entsprechend eine richtige Zahl.");
                }
            } while (etageGast < 1 || etageGast > 3 || zimmerGast < 1 || zimmerGast > 4 );

            if (hotel[etageGast][zimmerGast].trim().equalsIgnoreCase("frei")) {
                hotel[etageGast][zimmerGast] = nameGast.toUpperCase();
            } else {
                System.out.println("Das Zimmer ist bereits belegt!");
                continue;
            }

            System.out.println("\nDie aktuelle Zimmerbelegung: \n");
            for (int etage = 0; etage < hotel.length; etage++) {
                for (int zimmer = 0; zimmer < hotel[etage].length; zimmer++) {
                    System.out.print(hotel[etage][zimmer] + " ");
                }
                System.out.print("\n");
            }
        }
        System.out.println("Ende!");
    }
}
