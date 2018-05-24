package com.dzioba.Hanoi;

import java.util.LinkedList;
import java.util.List;

public class Hanoi {

    private final int discs;

    public Hanoi(int discs) {
        this.discs = discs;
        start();
    }

    private void throwExceptionIfWrongDiscAmount() {
        if(notProperDiscAmount(discs))
            throw new IllegalArgumentException("Disc amount can't be lower than 1");
    }

    private boolean notProperDiscAmount(int discAmount) {
        return discAmount < 1;
    }

    public void start() {
        try {
            throwExceptionIfWrongDiscAmount();
            HanoiGame hg = new HanoiGame(discs, new LinkedList<>());
            List<Move> moves =  hg.start();
            moves.forEach(System.out::println);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


}
