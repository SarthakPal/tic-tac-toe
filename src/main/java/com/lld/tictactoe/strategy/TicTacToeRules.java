package com.lld.tictactoe.strategy;

import com.lld.tictactoe.model.Board;
import com.lld.tictactoe.model.Symbol;

public interface TicTacToeRules {
    boolean isValidMove(Board board, int row, int col);
    boolean checkWinCondition(Board board, Symbol symbol);
    boolean checkDrawCondition(Board board);
}
