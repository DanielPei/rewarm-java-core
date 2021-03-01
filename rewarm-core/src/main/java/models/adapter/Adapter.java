package models.adapter;

public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.oldRequest();
    }

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
