package models.facade;

public class Facade {

    private SubSys1 sys1;
    private SubSys2 sys2;

    public Facade(){
        this.sys1 = new SubSys1();
        this.sys2 = new SubSys2();
    }

    public void process(){
        this.sys1.process();
        this.sys2.process();
    }
}
