package Raumschiff;

public class Raumschiff {

    String name;
    int energieReserven;
    double schadenProLaser;
    double leben;

    public Raumschiff(String name, int energieReserven, double schadenProLaser, double leben) {
        this.name = name;
        this.energieReserven = energieReserven;
        this.schadenProLaser = schadenProLaser;
        this.leben = leben;
    }

    public double getLeben() {
        return this.leben;
    }

    public void  takeDamage(double damage) {
        leben -= damage;
    }

    public double feuern(Raumschiff target, int anzahlSchuesse) {
        energieReserven -= anzahlSchuesse;
        double damage = anzahlSchuesse * schadenProLaser;
        target.takeDamage(damage);
        System.out.printf("%s hat %.2f Schaden von %s abbekommen!\n",target.name, damage, this.name);
        System.out.printf("Das feindliche Schiff hat nun %.2f Leben.\n", target.leben);
        return damage;
    }

    public void triebwerkeStarten() {
        System.out.println("Wusch! Der " + name + " hebt ab und ist kampfbereit!");
    }
}
