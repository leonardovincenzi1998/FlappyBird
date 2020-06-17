package model;

/**
 * Class that manage the score of user
 */
public class ScoreImpl implements Score{

    private int score;

    /**
     * This is the constructor method that initializes the score to 0
     */
    public ScoreImpl() {
        score = 0;
    }
    @Override
    public void setScore(final int n) {
        score = n;
    }

    @Override
    public void incrementScore() {
        score++;
    }

    @Override
    public int getScore() {
        return score;
    }
}
