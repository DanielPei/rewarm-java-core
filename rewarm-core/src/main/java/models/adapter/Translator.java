package models.adapter;

public class Translator extends Player{
    private ForeignPlayer foreignPlayer = new ForeignPlayer();

    public Translator(String name){
        super(name);
        this.foreignPlayer.setName(name);
    }

    @Override
    public void attack() {
        this.foreignPlayer.JinGong();
    }

    @Override
    public void defence() {
        this.foreignPlayer.FangShou();
    }

    public static void main(String[] args) {
        Player forward = new ForwardPlayer("Bundy");
        Player middle = new MidPlayer("Mike");
        Player backward = new BackwardPlayer("John");
        Player foreign = new Translator("王");

        forward.attack();
        middle.attack();
        backward.attack();

        foreign.attack();

        forward.defence();
        foreign.defence();
    }
}
