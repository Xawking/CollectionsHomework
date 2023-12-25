package ru.netology;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Game {
    List<Player> playerList = new ArrayList<>();

    public void register(Player player) {
        if (!player.getIsRegistered()) {
            playerList.add(player);
            player.setRegistered(true);
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


    public int round(String playerName1, String playerName2, Comparator<Player> comparator) {
        Player player1 = null;
        Player player2 = null;
        player1 = findByName(playerName1);
        player2 = findByName(playerName2);

        if (player1 == null) {
            throw new NotFoundException("Player " + player1.getName() + " Is not found");
        }
        if (player2 == null) {
            throw new NotFoundException("Player " + player2.getName() + " Is not found");
        }
        if (!player1.getIsRegistered()) {
            throw new NotRegisteredException("Player " + player1.getName() + " Is not registered");
        }
        if (!player2.getIsRegistered()) {
            throw new NotRegisteredException("Player " + player2.getName() + " Is not registered");
        }


        return comparator.compare(player1, player2);

    }
}
