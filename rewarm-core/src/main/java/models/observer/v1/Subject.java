package models.observer.v1;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObserver();

    String getStatus();

    void setStatus(String status);
}
