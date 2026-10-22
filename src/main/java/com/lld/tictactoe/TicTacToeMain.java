package com.lld.tictactoe;

import com.lld.tictactoe.enums.GameType;
import com.lld.tictactoe.factory.TicTacToeGameFactory;
import com.lld.tictactoe.model.Symbol;
import com.lld.tictactoe.observer.ConsoleNotifier;
import com.lld.tictactoe.observer.IObserver;

import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        System.out.println("=== TIC TAC TOE GAME ===");

        // Create game with custom board size
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter board size (e.g., 3 for 3x3): ");
        int boardSize = scanner.nextInt();

        TicTacToeGame game = TicTacToeGameFactory.createGame(GameType.STANDARD, boardSize);

        // Add observer
        IObserver notifier = new ConsoleNotifier();
        game.addObserver(notifier);

        // Create players with custom symbols
        TicTacToePlayer player1 = new TicTacToePlayer(1, "Aditya", new Symbol('X'));
        TicTacToePlayer player2 = new TicTacToePlayer(2, "Harshita", new Symbol('O'));

        game.addPlayer(player1);
        game.addPlayer(player2);

        // Play the game
        game.play();

        scanner.close();
    }
}
