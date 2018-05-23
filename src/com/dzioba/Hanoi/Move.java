package com.dzioba.Hanoi;

public class Move {
    private Tower from;
    private Tower to;
    private Disc disc;

    public Move(Tower from, Tower to, Disc disc) {
        this.from = from;
        this.to = to;
        this.disc = disc;
    }

    @Override
    public String toString() {
        return "Moving disc " + disc + "from " + from + " to " + to + ".";
    }
}
