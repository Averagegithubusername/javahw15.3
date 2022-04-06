package domain;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public List<Player> players = new ArrayList<>();
    Player p1 = new Player();
    Player p2 = new Player();

    public boolean register(Player player) {
        return players.add(player);
    }

    public void findByName(String playerName1, String playerName2) {
        for (Player player : players) {
            if (player.getName().equals(playerName1)) {
                p1 = player;
            }
            if (player.getName().equals(playerName2)) {
                p2 = player;
            }
        }
    }

    public int round(String playerName1, String playerName2) {
        findByName(playerName1, playerName2);
        if (p1.getStrength() > p2.getStrength()) {
            System.out.println("Выйграл " + p1.getName());
            return  1;
        }
        if (p1.getStrength() < p2.getStrength()) {
            System.out.println("Выйграл " + p2.getName());
            return 2;
        }
        System.out.println("Ничья");
        return 0;
    }
}