package com.lld.tictactoe.factory;

import com.lld.tictactoe.TicTacToeGame;
import com.lld.tictactoe.enums.GameType;

public class TicTacToeGameFactory {
    public static TicTacToeGame createGame(GameType gt, int boardSize) {
        if(GameType.STANDARD == gt) {
            return new TicTacToeGame(boardSize);
        }
        return null;
    }
}
