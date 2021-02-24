package models.template_method;

public class Mall extends Template {

    @Override
    String getName() {
        return this.getClass().getName();
    }

    @Override
    String getSomething() {
        return "Milk";
    }
}
