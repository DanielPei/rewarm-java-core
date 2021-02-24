package models.template_method;

public class School extends Template{
    @Override
    String getName() {
        return this.getClass().getName();
    }

    @Override
    String getSomething() {
        return "Book";
    }
}
