package com.dzioba;

import com.dzioba.Hanoi.HanoiGame;
import com.dzioba.Hanoi.Move;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HanoiGame hanoi = new HanoiGame(2, new LinkedList<>());
        List<Move> moves = hanoi.start();
        for(Move move: moves)
            System.out.println(move);
    }
}
