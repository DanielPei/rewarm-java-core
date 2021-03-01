package models.status;

public class StatusDemo {
    public static void main(String[] args) {
        Work work = new Work();

        work.setHour(8);
        work.checkStatus();

        work.setHour(10);
        work.checkStatus();

        work.setHour(15);
        work.checkStatus();

        work.setHour(20);
        work.checkStatus();

        work.setWorkFinished(true);
        work.setHour(22);
        work.checkStatus();
    }
}
