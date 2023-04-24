package com.megha.game;

import java.util.Scanner;

public class Game {
    Board board;
    Dice dice;
    GameStatus status;

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.status = GameStatus.NOT_STARTED;
    }

    public void gameStart() {
        final int WinPoint = 100;
        this.status = GameStatus.RUNNING;
        board.printBoard();

        while (board.getPlayerList().size() >(board.getWinnerList().size()+1)) {
           // Player player =;
            //movePlayer();

            //print player name chance
            //enter to roll dice
            //print number
            //movePlayer-> number

        }
    }


    public static void main(String args[]) {
        Board board = new Board();
        Dice dice = new Dice();
        Game game = new Game(board, dice);

        Snake snake1 = new Snake(99, 54);
        Snake snake2 = new Snake(70, 55);
        Snake snake3 = new Snake(52, 42);
        Snake snake4 = new Snake(25, 2);
        Snake snake5 = new Snake(95, 72);
        board.addSnake(snake1);
        board.addSnake(snake2);
        board.addSnake(snake3);
        board.addSnake(snake4);
        board.addSnake(snake5);


        Ladder ladder1 = new Ladder(3, 41);
        Ladder ladder2 = new Ladder(10, 22);
        Ladder ladder3 = new Ladder(50, 82);
        Ladder ladder4 = new Ladder(24, 71);
        Ladder ladder5 = new Ladder(66, 94);
        board.addLadder(ladder1);
        board.addLadder(ladder2);
        board.addLadder(ladder3);
        board.addLadder(ladder4);
        board.addLadder(ladder5);
        //print game start
        //user input number
        getPlayerDetails(board);


        game.gameStart();

    }

    private static void getPlayerDetails(Board board) {
        System.out.println("Enter Number of player");
        Scanner sc = new Scanner(System.in);
        int playerCount = sc.nextInt();
        isValidPlayerCount(playerCount); //Validate the number

        //int x = 0;
        while (playerCount > 1) {
            //Print "Enter Player Name"
            String playerName = sc.nextLine();
            System.out.println("playerName :");
            Player player1 = new Player(playerName);
            board.addPlayer(player1);
            playerCount--;
        }
    }

    private static void isValidPlayerCount(int playerCount) {
       if(playerCount < 2){
           System.out.println("Required minimum 2 players");
       }else {
           System.out.println("Welcome in Snake and Ladder game");
       }
    }

    private void movePlayer(Player player){
        System.out.println();

        System.out.println();
    }
}
