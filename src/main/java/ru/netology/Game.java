package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Player> playerList = new ArrayList<>();

    public void register(Player player) {
        if (playerList.contains(player)) {
            throw new AlreadyExistsException("Player " + player.getName() + " is already registered");
        } else {
            playerList.add(player);
        }

    }

    public Player findByName(String name) {
        Player found = null;
        for (Player player : playerList) {
            if (player.getName().equals(name)) {
                found = player;

            }

        }
        return found;
    }


    public int round(String playerName1, String playerName2) {
        Player player1;
        Player player2;
        player1 = findByName(playerName1);
        player2 = findByName(playerName2);

        if (player1 == null) {
            throw new NotRegisteredException("Player " + playerName1 + " Is not registered");
        }
        if (player2 == null) {
            throw new NotRegisteredException("Player " + playerName2 + " Is not registered");
        }


        return player1.compareTo(player2);

    }
}
