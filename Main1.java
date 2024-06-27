package task;

public class Main1 {

    public static void main(String[] args) {
        Game1 game = new Game1(1, 100, 5); // Initialize game with range 1-100 and 5 attempts per round
        GameGUI gameGUI = new GameGUI(game);
        gameGUI.init();
    }
}

