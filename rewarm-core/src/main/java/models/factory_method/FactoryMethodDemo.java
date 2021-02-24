package models.factory_method;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setA(1);
        operation.setB(5);
        System.out.println("Result : " + operation.getResult().toString());
    }
}
