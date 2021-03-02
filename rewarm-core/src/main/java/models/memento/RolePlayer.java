package models.memento;

import java.util.Random;

public class RolePlayer {

    private int hp;
    private int mp;
    private int sp;
    private String name;

    public RolePlayer(String name) {
        this.name = name;
        this.hp = 100;
        this.mp = 100;
        this.sp = 100;
    }

    public Memento save() {
        return new Memento(hp = this.hp, mp = this.mp, sp = this.sp);
    }

    public void restore(Memento memento) {
        if(memento == null){
            return;
        }
        this.hp = memento.getHp();
        this.mp = memento.getMp();
        this.sp = memento.getSp();
    }

    public void fight() {
        this.hp -= Math.random() * 100;
        this.mp -= Math.random() * 100;
        this.sp -= Math.random() * 100;
    }

    public void show() {
        System.out.println(this.name + "'s current status : [ HP : " + this.hp + " ; MP : " + this.mp + " ; SP : " + this.sp + " ]");
    }

    public String getName() {
        return name;
    }
}
