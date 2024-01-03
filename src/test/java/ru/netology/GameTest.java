package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GameTest {
    @Test
    public void jinaShouldWin() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        PlayerComparator comparator = new PlayerComparator();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        int expected = 2;
        int actual = game.round("Said", "Jina", comparator);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldThrowNotRegistered() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        PlayerComparator comparator = new PlayerComparator();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Boris", "Dimitry", comparator);
        });

    }

    @Test
    public void shouldNotRegister() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        PlayerComparator comparator = new PlayerComparator();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player1);
        List<Player> expected = new ArrayList<>();
        expected.add(player1);
        expected.add(player2);
        expected.add(player3);
        List<Player> actual = game.playerList;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void saidShouldWin() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        PlayerComparator comparator = new PlayerComparator();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        int expected = 1;
        int actual = game.round("Said", "Boris", comparator);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void itsADraw() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 10, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        PlayerComparator comparator = new PlayerComparator();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        int expected = 0;
        int actual = game.round("Said", "Jina", comparator);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldThrowNotRegisteredOnPlayer1() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        PlayerComparator comparator = new PlayerComparator();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Dimitry", "Boris", comparator);
        });

    }

}