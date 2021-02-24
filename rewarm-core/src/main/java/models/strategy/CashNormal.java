package models.strategy;

public class CashNormal extends CashOperation {


    @Override
    public double acceptCash(double money) {
        return money;
    }
}
