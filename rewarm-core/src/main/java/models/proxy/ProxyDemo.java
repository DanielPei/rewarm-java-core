package models.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Person person = new Person("Dan");
        Person person1 = new Person("Ann");

        System.out.println("Normal mode : ....");
        RealSubject realSubject = new RealSubject();
        realSubject.request(person);
        realSubject.request(person1);

        System.out.println("Proxy mode : ......");
        Subject proxy = new ProxySubject();
        proxy.request(person);
        proxy.request(person1);
    }
}
