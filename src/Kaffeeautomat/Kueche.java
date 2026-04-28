package Kaffeeautomat;

import java.util.Scanner;

public class Kueche {
    public static void main(String[] args) {

        Kaffeemaschine kaffeemaschine1 = new Kaffeemaschine("Senseo");
        Scanner leser = new Scanner(System.in);

        boolean wasserNachfuellen = true;

        do {
            System.out.print("Wie viel Wasser möchten Sie auffüllen? ");
            int auffuellen = leser.nextInt();
            leser.nextLine();
            kaffeemaschine1.wasserEinfuellen(auffuellen);

            System.out.println("Der Tank enthät " + kaffeemaschine1.getWasserstand() + " ml Wasser. Wollen Sie mehr auffüllen? ");
            while (true) {
                String antwort = leser.nextLine();
                antwort = antwort.toLowerCase();

                if (antwort.equals("nein")) {
                    wasserNachfuellen = false;
                    break;
                } else if (antwort.equals("ja")) {
                    wasserNachfuellen = true;
                    break;
                } else {
                    System.out.println("Ungültige Eingabe, bitte mit 'ja' oder 'nein' antworten!");
                }
            }

        } while (wasserNachfuellen);

    }
}