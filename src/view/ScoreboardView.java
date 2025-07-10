package view;

import controller.ScoreController;

public class ScoreboardView {
    public static void viewScoreboard(){
        ScoreController scoreController =new ScoreController();
        System.out.println("Scoreboard with username, score and played date: \n");
        scoreController.displayScoreboard();

    }

}


