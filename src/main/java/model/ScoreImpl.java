package model;

public class ScoreImpl implements Score{

    private int score;

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
