package controller;


import dao.ScoreDAO;
import model.Scoreboard;

import java.time.LocalDate;
import java.util.Date;

public class ScoreController {
    ScoreDAO scoreDao= new ScoreDAO();

    public boolean score(int score){
        Date date = new Date();
        Scoreboard scoreBoard= new Scoreboard(1,score, date);
        return (scoreDao.addScore(scoreBoard));


    }
}
