package controller;


import dao.ScoreDAO;
import model.Scoreboard;

import java.util.ArrayList;



public class ScoreController {
    ScoreDAO scoreDao= new ScoreDAO();

    ArrayList<Scoreboard> scores=scoreDao.getScoreDetails();

    public boolean addToScoreboard(Scoreboard scoreboard){
        Scoreboard scoreBoard= new Scoreboard(scoreboard.getUserId(), scoreboard.getScore());
        return (scoreDao.addScore(scoreBoard));
    }
    public void displayScoreboard(){

        if ( scores!=null){
            int i=0;

            for (Scoreboard score: scores){

                System.out.println("S.N. "+i);
                System.out.println("----------------------------------------------");
                System.out.println("Name = "+score.getPlayerName());
                System.out.println("Score = "+score.getScore());
                System.out.println("Played date = "+score.getPlayedDate());
                System.out.println("----------------------------------------------\n");
                i++;
            }
        }
        else {
            System.out.println("No scores to display");
        }
    }
}
