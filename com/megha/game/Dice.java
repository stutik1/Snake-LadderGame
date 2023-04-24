package com.megha.game;

public class Dice {
    int die = 6;
    public int roll() {
        return (int) (Math.random() * die + 1);
    }
}
