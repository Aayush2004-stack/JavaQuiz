package model;

import java.util.Date;

public class Scoreboard {

    private int scoreID;
    private int score;
    private Date playedDate;

    public Scoreboard(int scoreID, int score, Date playedDate) {
        this.scoreID = scoreID;
        this.score = score;
        this.playedDate = playedDate;
    }
}
