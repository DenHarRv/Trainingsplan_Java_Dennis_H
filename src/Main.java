import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Audi");

        Scanner leser = new Scanner(System.in);

        System.out.print("Wie viel wollen Sie tanken: ");
        double tanken = leser.nextDouble();
        auto1.tanken(tanken);

        auto1.motorSchalten();
        auto1.motorSchalten();

        System.out.print("Wie viel wollen Sie beschleunigen: ");
        int beschleunigen = leser.nextInt();
        auto1.gasGeben(beschleunigen);

        auto1.motorSchalten();

        System.out.print("Wie viel wollen Sie beschleunigen: ");
        beschleunigen = leser.nextInt();
        auto1.gasGeben(beschleunigen);
    }
}