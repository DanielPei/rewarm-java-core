package models.factory_method;

import models.factory_method.Operation;

public class MinusOperation extends Operation {

    @Override
    public Integer getResult() {
        return this.getA() - this.getB();
    }
}
