package Lexikon;
import Auto.Auto;
import java.util.Scanner;

public class JavaGrundlagen {
    public static void main(String[] args) {


        //================================================
        //Variablenübersicht
        //================================================
        int ganzeZahl = 1;          //Für ganze Zahlen
        double kommazahl = 1.5;     //Für Kommazahlen
        String text = "text";       //Für Texte
        boolean jaOderNein = true;  //True oder False
        //================================================



        //================================================
        //Scanner erstellen
        //================================================
        Scanner leser = new Scanner(System.in);
        //================================================



        //================================================
        //Operatoren
        //================================================

        //  =   -   Wert zuweisen   Das "=" weist einer Variable einen Wert zu.

        // Vergleiche:
        //  ==  -   gleich          Beispiel: (zahl == 1)               -> ist true, falls die Zahl genau 1 ist
        //  >   -   größer          Beispiel: (zahl > 1)                -> ist true, falls die Zahl größer 1 ist
        //  <   -   kleiner         Beispiel: (zahl < 1)                -> ist true, falls die Zahl kleiner 1 ist
        //  >=  -   größer/gleich   Beispiel: (zahl >= 1)               -> ist true, falls die Zahl größer oder gleich 1 ist
        //  <=  -   kleiner/gleich  Beispiel: (zahl <= 1)               -> ist true, falls die Zahl kleiner oder gleich 1 ist

        // Logik:
        //  &&  -   und             Beispiel: (zahl == 1 && andere == 2) -> ist true, falls beide Bedingungen stimmen
        //  ||  -   oder            Beispiel: (zahl == 1 || zahl == 2)   -> ist true, falls eine der Bedingungen stimmt
        //  !   -   nicht           Beispiel: !(zahl == 1)               -> ist true, falls die Bedingung in der Klammer false ist

        // Rechnen:
        //  +   -   plus
        //  ++  -   Erhöhung um 1       Beispiel:   zahl++ (Erhöht den Wert der Variable um 1)
        //  -   -   minus
        //  --  -   Verringerung um 1   Beispiel:   zahl-- (Verringert den Wert der Variable um 1)
        //  *   -   mal
        //  /   -   geteilt
        //================================================



        //================================================
        //If-Else-Verzweigung (Bedingung)
        //================================================
        //if (Bedingung um diesen Block zu betreten)
        //else if (nächste Bedingung um diesen Block zu betreten.)
        //else (Wenn keine Bedingung zutrifft, wird dieser letzte Block betreten)
        //else kann weggelassen werden; falls keine Bedingung zutrifft, geht das Programm einfach weiter.

        //Klassisch
        if (ganzeZahl == 1) {
            System.out.println("if: Zahl ist gleich 1");
        } else if (ganzeZahl == 2) {
            System.out.println("else if: Zahl ist gleich 2");
        } else {
            System.out.println("else: Zahl irgendwas anderes als 1 oder 2");
        }

        //Ohne else, Programm geht nicht in die Schleife und macht weiter
        if (ganzeZahl == 1) {
            System.out.println("if: Dieser Text kommt, falls ganzeZahl eine 1 ist. Falls ganzeZahl keine 1 ist, geht das Programm normal weiter.");
        }

        //Nutzen wir ein !, so wird die Bedingung umgekehrt.
        //In diesem Fall sagen wir !ganzeZahl, entspricht die Zahl nicht 2, gehen wir in die Klammern
        if (!(ganzeZahl == 2)){
            System.out.println("!if: ganzeZahl hat einen anderen Wert als 2, weshalb dieser Text kommt.");
        }
        //================================================



        //================================================
        //Switch-Case (Verzweigung)
        //================================================
        //Wir ordnen dem Switch einen Wert zu. Entsprechend dem Wert wird der case gewählt.
        //Nützlich für Menüs, in denen der User etwas mit einer Zahl auswählen soll.
        //Wir nutzen break; damit das System nach dem Case den Switch-Block verlässt.
        //Falls der Wert zu keinem case passt, nutzen wir default als "Plan B".

        switch (ganzeZahl) {
            case 1: {
                System.out.println("case 1 mit: Der Wert war eine 1.");
                break;
            }
            case 2: {
                System.out.println("case 2: Der Wert war eine 2.");
                break;
            }
            case 3: {
                System.out.println("case 3: Der Wert war eine 3.");
                break;
            }
            default: {
                System.out.println("default: Da der Wert weder 1, 2 oder 3 was, wurde unser Plan B genutzt.");
                break;
            }
        }
        //================================================



        //================================================
        //For-Schleife
        //================================================
        //Nutzen wir als Zähler mit einem Startwert, einer Bedingung und einer Aktion pro Schritt.
        for (int i = 1; i == ganzeZahl; i++) {
            // Die Schleife startet mit i=1. Da i == ganzeZahl (1) ist, läuft sie einmal.
            System.out.println("for: Wir haben einmal gerechnet und i ist jetzt: " + i);
            // Nach dem Durchlauf wird i zu 2. Die Bedingung (2 == 1) ist falsch -> Ende.
        }
        //================================================



        //================================================
        //Array
        //================================================
        //Eine Liste für erstellte Objekte, hier aus dem Beispiel aus "Rennstrecke"
        Auto[] garage = new Auto[3];
        garage[0] = new Auto("Audi");
        garage[1] = new Auto("BMW");
        garage[2] = new Auto("VW");
        //================================================
    }
}