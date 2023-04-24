package com.megha.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    Map<Integer, Snake> locVsSnake = new HashMap<>();
    Map<Integer, Ladder> locVsLadder = new HashMap<>();
    Map<Integer, Player> locVsPlayer = new HashMap<>();
    List<Player> playerList = new ArrayList<>();
    List<Player> winnerList = new ArrayList<>();
    private boolean isSnakeBite;
    private boolean isLadder;

    public void addSnake(Snake snake) {
        locVsSnake.put(snake.head, snake);
    }

    public boolean isSnakeBite(int pos) {
        return locVsSnake.containsKey(pos);
    }

    public Snake getSnake(int pos) {
        return locVsSnake.get(pos);
    }

    public void addLadder(Ladder ladder) {
        locVsLadder.put(ladder.head, ladder);
    }

    public boolean isLadder(int pos) {
        return locVsLadder.containsKey(pos);
    }

    public Ladder getLadder(int pos) {
        return locVsLadder.get(pos);
    }

    public void addPlayer(Player player) {
        player.setId(playerList.size() + 1);
        locVsPlayer.put(0, player);
        playerList.add(player);
    }

    public void getPlayer(String id) {
        playerList.get(Integer.getInteger(id) - 1);
    }

    public void getPlayer(int id) {
        playerList.get(id - 1);
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
    public List<Player> getWinnerList() {
        return winnerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void moverPlayer(int diceNumber, Player player) {
        //calculate pos
        //update player location
        //
    }

    public void printBoard() {
        int x = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("| ");
                if(isSnakeBite){
                    System.out.print("*");
                }
                else if (isLadder){
                    System.out.print("/");
                }
//
//
//                System.out.print("1");
//                System.out.print(" ");
                x++;
            }
            System.out.println();
        }
    }
}



