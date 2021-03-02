package models.memento;

import java.util.HashMap;

public class GameCenter {

    private HashMap<String, Memento> mementos = new HashMap<>();

    public static void main(String[] args) {
        GameCenter gameCenter = new GameCenter();

        RolePlayer playerA = new RolePlayer("Dan");
        RolePlayer playerB = new RolePlayer("Ann");
        playerA.show();
        playerB.show();

        gameCenter.mementos.put(playerA.getName(),playerA.save());
        gameCenter.mementos.put(playerB.getName(),playerB.save());

        playerA.fight();
        playerB.fight();
        playerA.show();
        playerB.show();

        playerA.restore(gameCenter.mementos.get(playerA.getName()));
        playerB.restore(gameCenter.mementos.get(playerB.getName()));
        playerA.show();
        playerB.show();
    }
}
