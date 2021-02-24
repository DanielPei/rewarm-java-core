package models.proxy;

public class RealSubject implements Subject {
    public RealSubject() {
        System.out.println("I am very expensive to init!");
    }

    @Override
    public void request(Person person) {
        System.out.println("[" + this.getClass().getName() + "]" + "Real subject request! => " + person.getName());
    }
}
