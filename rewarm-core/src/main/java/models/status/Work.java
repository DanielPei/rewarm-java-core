package models.status;

public class Work {

    private int hour;

    private boolean isWorkFinished;

    private Status status;

    public Work(){
        status = new StatusFull();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isWorkFinished() {
        return isWorkFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        isWorkFinished = workFinished;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void checkStatus(){
        System.out.println("Current time : " + this.hour);
        status.checkStatus(this);
    }
}
