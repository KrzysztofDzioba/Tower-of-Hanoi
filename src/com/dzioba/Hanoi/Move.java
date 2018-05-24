package com.dzioba.Hanoi;

class Move {
    private final Tower from;
    private final Tower to;
    private final Disc disc;

    Move(Tower from, Tower to, Disc disc) {
        this.from = from;
        this.to = to;
        this.disc = disc;
    }

    @Override
    public String toString() {
        return "Moving disc " + disc + "from " + from + " to " + to + ".";
    }
}
