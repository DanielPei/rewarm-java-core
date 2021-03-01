package models.observer.v1;

public class ObserverV1Demo {
    public static void main(String[] args) {
        Subject subject = new SubjectX();
        Subject subject1 = new SubjectY();

        Observer ob1 = new ObserverA("Dan",subject);
        Observer ob2 = new ObserverB("Ann", subject);

        subject.attach(ob1);
        subject.attach(ob2);
        subject1.attach(ob1);

        subject.setStatus("Coming");
        subject.notifyObserver();

        subject.setStatus("Leaving");
        subject.notifyObserver();

        subject1.setStatus("Coming");
        subject1.notifyObserver();
    }
}
