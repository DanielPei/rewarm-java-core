package models.strategy;

public class CashRebate extends CashOperation{
    private double moneyRebate;

    public CashRebate(String rebate){
        this.moneyRebate = Double.parseDouble(rebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * this.moneyRebate;
    }
}
