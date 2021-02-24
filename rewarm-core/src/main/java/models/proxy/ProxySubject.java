package models.proxy;

public class ProxySubject implements Subject {
    RealSubject realSubject;

    @Override
    public void request(Person person) {
        System.out.println("Proxy subject request!");
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request(person);
    }
}
