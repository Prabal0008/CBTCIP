package task;

public class Score1 {

    private int roundsPlayed;
    private int totalScore;

    public Score1() {
        roundsPlayed = 0;
        totalScore = 0;
    }

    public void updateScore(int score) {
        roundsPlayed++;
        totalScore += score;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
