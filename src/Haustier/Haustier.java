package Haustier;

public class Haustier {
    String name;
    int energie;
    int hunger;

    public Haustier( String name ) {
        this.name = name;
        this.energie = 100;
        this.hunger = 50;
    }

    public void fuettern(int portionen) {
        this.hunger -= portionen * 10;
        System.out.printf("Mampf! %s hat gegessen. Der Hunger liegt jetzt bei %d!\n", this.name, this.hunger);
    }

    public String spielen(int minuten) {
        this.energie -= minuten * 2;
        if (this.energie > 0) {
            return this.name + " springt fröhlich herum! Restenergie: " + this.energie;
        }
        return this.name + " ist völlig erschöpft und sofort eingeschlafen.";

    }
}
