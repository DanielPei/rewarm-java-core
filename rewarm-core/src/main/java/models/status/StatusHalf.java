package models.status;

public class StatusHalf extends Status{
    @Override
    public void checkStatus(Work work) {
        if (work.getHour()<12){
            System.out.println("I've worked a while, need some rest!");
        }else{
            work.setStatus(new StatusQuart());
            work.checkStatus();
        }
    }
}
