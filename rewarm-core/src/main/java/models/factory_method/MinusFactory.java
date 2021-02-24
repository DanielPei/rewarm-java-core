package models.factory_method;

public class MinusFactory implements IFactory {


    @Override
    public Operation createOperation() {
        return new MinusOperation();
    }
}
