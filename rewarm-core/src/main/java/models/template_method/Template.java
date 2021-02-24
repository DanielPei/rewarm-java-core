package models.template_method;

public abstract class Template {

    public void templateMethod() {
        System.out.println("I am the implement from class :" + getName());
        System.out.println("I got a :" + getSomething());
    }

    abstract String getName();

    abstract String getSomething();
}
