package models.observer.v1;

public class ObserverA implements Observer{

    private String name;
    private Subject subject;

    public ObserverA (String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(subject.getClass().getName() + " updated me " + subject.getStatus() );
    }
}
