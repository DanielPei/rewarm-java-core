package models.status;

public class StatusQuart extends Status{
    @Override
    public void checkStatus(Work work) {
        if (work.getHour() < 19){
            System.out.println("I am tired, i want to go home ...");
        }else{
            work.setStatus(new StatusOff());
            work.checkStatus();
        }
    }
}
