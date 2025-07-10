package controller;


import dao.ScoreDAO;
import model.Scoreboard;





public class ScoreController {
    ScoreDAO scoreDao= new ScoreDAO();




    public boolean scoreboard(Scoreboard scoreboard){


        Scoreboard scoreBoard= new Scoreboard(scoreboard.getUserId(), scoreboard.getScore());
        return (scoreDao.addScore(scoreBoard));


    }
}
