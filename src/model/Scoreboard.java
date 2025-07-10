package model;


import java.util.Date;

public class Scoreboard {
    private int userId;
    private int score;
    private Date playedDate;
    private String playerName;


    public Scoreboard(int userId, int score) {
        this.userId = userId;
        this.score = score;
    }
    public Scoreboard(String playerName, int score, Date playedDate){
        this.playerName=playerName;
        this.score=score;
        this.playedDate=playedDate;
    }

    public int getUserId() {
        return userId;
    }



    public int getScore() {
        return score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Date getPlayedDate() {
        return playedDate;
    }


}