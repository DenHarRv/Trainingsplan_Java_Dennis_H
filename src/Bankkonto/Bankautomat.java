package Bankkonto;

import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args) {

        Bankkonto meinKonto = new Bankkonto("Dagobert", 1000.00);

        System.out.printf("Willkommen %s! Dein Kontostand ist: %.2f Euro.\n", meinKonto.kundenName, meinKonto.getKontostand());

        System.out.println("Versuche 200 Euro abzuheben...");
        meinKonto.abheben(200.00);

        System.out.println("Veruche 5000 Euro abzuheben...");
        meinKonto.abheben(5000.00);

        Scanner leser = new Scanner(System.in);
        System.out.print("Wie viel möchtest du einzahlen? ");
        double betrag = leser.nextDouble();
        leser.nextLine();
        meinKonto.einzahlen(betrag);

        System.out.print("Wollen Sie ihren aktuellen Kontostand checken? ja / nein: ");
        String kontoChecken = leser.nextLine();
        kontoChecken = kontoChecken.toLowerCase();

        if (kontoChecken.equals("ja")) {
            System.out.printf("Ihr aktueller Kontostand beträgt %.2f Euro.\n", meinKonto.getKontostand());
        } else if (kontoChecken.equals("nein")) {
            System.out.println("Bis zum nächsten Mal!");
        }
    }
}