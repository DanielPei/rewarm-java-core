package models.memento;

public class Memento {

    private int hp;
    private int mp;
    private int sp;

    public Memento(int hp, int mp, int sp) {
        this.hp = hp;
        this.mp = mp;
        this.sp = sp;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getSp() {
        return sp;
    }
}
