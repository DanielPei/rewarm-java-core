package models.status;

public class StatusFull extends Status{
    @Override
    public void checkStatus(Work work) {
        if (work.getHour() < 9){
            System.out.println("I am at home with full power!!!");
        }else{
            work.setStatus(new StatusHalf());
            work.checkStatus();
        }
    }
}
