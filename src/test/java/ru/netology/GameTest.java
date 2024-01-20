package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    public void jinaShouldWin() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        int expected = 2;
        int actual = game.round("Said", "Jina");
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldThrowNotRegistered() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Boris", "Dimitry");
        });

    }

    @Test
    public void saidShouldWin() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        int expected = 1;
        int actual = game.round("Said", "Boris");
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void itsADraw() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 10, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        int expected = 0;
        int actual = game.round("Said", "Jina");
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldThrowNotRegisteredOnPlayer1() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Dimitry", "Boris");
        });

    }

    @Test
    public void shouldThrowAlreadyExists() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        Assertions.assertThrows(AlreadyExistsException.class, () -> {
            game.register(player1);
            ;
        });

    }

}