package models.adapter;

public class MidPlayer extends Player{
    public MidPlayer(String name){
        super(name);
    }

    @Override
    public void attack() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(this.getClass().getName() + " - " + this.name + " - " + methodName);
    }

    @Override
    public void defence() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(this.getClass().getName() + " - " + this.name + " - " + methodName);
    }
}
