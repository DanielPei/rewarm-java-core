package models.factory;

public class MinusOperation extends Operation{

    @Override
    public Integer getResult() {
        return this.getA() - this.getB();
    }
}
