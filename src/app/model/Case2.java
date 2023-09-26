package app.model;

public class Case2 extends Case1 {

    @Override
    public double calcWinSum(double bet) {
        return (super.calcWinSum(bet) - Taxcalc1());
    }
}
