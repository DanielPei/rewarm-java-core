package models.factory;

public class SimpleFactoryDemo {
    public static Operation createOperation(String opType){
        switch (opType){
            case "-":
                return new MinusOperation();
            default:
                return new AddOperation();
        }
    }

    public static void main(String[] args) {
        Operation op1 = SimpleFactoryDemo.createOperation("+");
        op1.setA(1);
        op1.setB(3);
        System.out.println(op1.getResult().toString());

        Operation op2 = SimpleFactoryDemo.createOperation("-");
        op2.setA(1);
        op2.setB(3);
        System.out.println(op2.getResult().toString());
    }

}
