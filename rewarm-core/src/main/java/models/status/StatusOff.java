package models.status;

public class StatusOff extends Status{
    @Override
    public void checkStatus(Work work) {
        if (work.isWorkFinished()){
            System.out.println("Go home!!!");
        }else{
            System.out.println("Still has some work to do ... !!! Crazy!!!");
        }
    }
}
