package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    public void jinaShoudWin() {
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
    public void shouldThrowNotFound() {
        Player player1 = new Player(1, 5, "Boris");
        Player player2 = new Player(11, 7, "Said");
        Player player3 = new Player(111, 10, "Jina");
        Game game = new Game();
        PlayerComparator comparator = new PlayerComparator();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        Assertions.assertThrows(NotFoundException.class, () -> {
            game.round("Boris", "Dimitry", comparator);
        });

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

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Boris", "Jina", comparator);
        });

    }

}