package task;

import java.util.Random;

public class Game1 {

    private int minRange;
    private int maxRange;
    private int maxAttempts;
    private int numberToGuess;
    private int attemptsLeft;
    private int round;
    private int score;

    private Random random = new Random();

    public Game1(int minRange, int maxRange, int maxAttempts) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.maxAttempts = maxAttempts;
        this.round = 0;
        this.score = 0;
    }

    public void startNewRound() {
        round++;
        attemptsLeft = maxAttempts;
        numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
    }

    public boolean guessNumber(int guessedNumber) {
        attemptsLeft--;
        if (guessedNumber == numberToGuess) {
            score += attemptsLeft + 1; // Score based on remaining attempts
            return true;
        } else {
            return false;
        }
    }

    public boolean isRoundOver() {
        return attemptsLeft == 0;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public int getRound() {
        return round;
    }

    public int getScore() {
        return score;
    }
}
