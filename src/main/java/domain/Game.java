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


    public Player findByName(String text) {
        for (Player player : players) {
            if (player.getName().equals(text)) {
                return player;
            }

        }
        return null;
    }

    public int round(String playerName1, String playerName2) {
        p1 = findByName(playerName1);
        if (p1 == null) throw new NotFoundException("Игрок " + playerName1 + " не зарегистрирован");
        p2 = findByName(playerName2);
        if (p2 == null) throw new NotFoundException("Игрок " + playerName2 + " не зарегистрирован");
        System.out.println(p2.compareTo(p1));
        return p2.compareTo(p1);


    }

//    public void findByName(String playerName1, String playerName2) {
//        for (Player player : players) {
//            if (player.getName().equals(playerName1)) {
//                p1 = player;
//            }
//            if (player.getName().equals(playerName2)) {
//                p2 = player;
//            }
//        }
//    }

//    public int round(String playerName1, String playerName2) {
//        findByName(playerName1, playerName2);
//        if (p1.getStrength() > p2.getStrength()) {
//            System.out.println("Выйграл " + p1.getName());
//            return  1;
//        }
//        if (p1.getStrength() < p2.getStrength()) {
//            System.out.println("Выйграл " + p2.getName());
//            return 2;
//        }
//        System.out.println("Ничья");
//        return 0;
//    }

}