package models.observer.v1;

import java.util.ArrayList;
import java.util.List;

public class SubjectY implements Subject{

    String status = null;

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        if(!this.observerList.contains(observer)){
            this.observerList.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.observerList.forEach( observer -> observer.update());
    }

    @Override
    public String getStatus() {
        return null;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
