package app.model;

public class Taxcalc2 extends Taxcacl1 {

    public double taxcalculation(double bet) {
        return bet - (bet * 10 / 100);
    }
}
