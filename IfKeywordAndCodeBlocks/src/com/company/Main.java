package com.company;

public class Main {

    public static void main(String[] args) {
        int score;

        score = calculateScore(false,800,5,100);
        System.out.println(score);
        score = calculateScore(true,10000,8,200);
        System.out.println(score);

        displayHighScorePosition("Johny",calculateHighScorePosition(1500));
        displayHighScorePosition("Mahmud",calculateHighScorePosition(900));
        displayHighScorePosition("Marx",calculateHighScorePosition(400));
        displayHighScorePosition("little Donky",calculateHighScorePosition(50));
    }



    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        else return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;

        if(playerScore >= 1000) position = 1;
        else if(playerScore >=500) position = 2;
        else if(playerScore>=100) position = 3;

        return position;
    }

}
