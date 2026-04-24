package Haustier;

public class Haustier2 {
    public static void main(String[] args) {

        Haustier haustier1 = new Haustier("Bello");
        Haustier haustier2 = new Haustier("Minka");

        haustier1.fuettern(3);
        System.out.println(haustier2.spielen(60));

        try {
            Thread.sleep(10000L);
        } catch (Exception e) {}

        System.out.println("Test");
    }
}