package org.example.trivial;

public class Question {

    private String description;
    private boolean isTrue;
    private int score;

    public Question(String description, boolean isTrue, int score) {
        this.description = description;
        this.isTrue = isTrue;
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
