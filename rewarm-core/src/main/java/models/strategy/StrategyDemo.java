package models.strategy;

/**
 * 策略模式，有点在于对调用方透出类少，减少耦合；
 * 调用方代码简洁；
 * 各类算法策略独立，可独立进行单元测试，互不耦合；
 */
public class StrategyDemo {

    public CashOperation cr;

    public StrategyDemo(String strategy){
        switch (strategy) {
            case "原价" -> cr = new CashNormal();
            case "5折" -> cr = new CashRebate("0.5");
            case "3折" -> cr = new CashRebate("0.3");
        }
    }

    public double acceptMoney(double money){
        return cr.acceptCash(money);
    }

    public static void main(String[] args) {
        StrategyDemo sd1 = new StrategyDemo("原价");
        System.out.println(sd1.acceptMoney(500));

        StrategyDemo sd2 = new StrategyDemo("5折");
        System.out.println(sd2.acceptMoney(500));

        StrategyDemo sd3 = new StrategyDemo("3折");
        System.out.println(sd3.acceptMoney(500));
    }
}
