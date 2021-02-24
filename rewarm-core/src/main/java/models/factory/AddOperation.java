package models.factory;

public class AddOperation extends Operation{

    @Override
    public Integer getResult() {
        return this.getA() + this.getB();
    }
}
