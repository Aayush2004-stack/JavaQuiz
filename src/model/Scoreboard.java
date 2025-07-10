package model;


import java.util.Date;

public class Scoreboard {
    private int userId;
    private int score;
    private Date playedDate;


    public Scoreboard(int userId, int score) {
        this.userId = userId;
        this.score = score;
        //this.playedDate = playedDate;
    }

    public int getUserId() {
        return userId;
    }



    public int getScore() {
        return score;
    }



    public Date getPlayedDate() {
        return playedDate;
    }


}