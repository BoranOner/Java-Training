package com.company.interfaces;

public class GameRunner {
    public static void main(String[] args){
        ChessGame game = new ChessGame();
        game.up();
        game.down();
        game.right();
    }
}
