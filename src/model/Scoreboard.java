package model;


import java.util.Date;

public class Scoreboard {
    private int userId;
    private int score;
    private Date playedDate;

    public Scoreboard(int score){
        this.score = score;

    }
    public Scoreboard(int userId, int score, Date playedDate) {
        this.userId = userId;
        this.score = score;
        this.playedDate = playedDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getPlayedDate() {
        return playedDate;
    }

    public void setPlayedDate(Date playedDate) {
        this.playedDate = playedDate;
    }
}