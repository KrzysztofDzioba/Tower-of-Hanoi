package com.dzioba.Hanoi;

public class Move {
    private Tower from;
    private Tower to;

    public Move(Tower from, Tower to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Move{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
