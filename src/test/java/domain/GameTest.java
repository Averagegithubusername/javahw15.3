package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    private Game game = new Game();

    private Player player1 = new Player(1, "Иван", 5);
    private Player player2 = new Player(2, "Дмитрий", 1);
    private Player player3 = new Player(3, "Николай", 3);
    private Player player4 = new Player(4, "Павел", 9);
    private Player player5 = new Player(5, "Олег", 9);

    @BeforeEach
    public void setUp() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);
    }

    @Test
    void shouldWinPlayer2() {
        int actual = game.round("Дмитрий", "Николай");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void shouldWinPlayer1() {
        int actual = game.round("Иван", "Дмитрий");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldBeDraw() {
        int actual = game.round("Павел", "Олег");
        int expected = 0;
        assertEquals(expected, actual);
    }
}