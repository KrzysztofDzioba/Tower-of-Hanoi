package com.dzioba.Hanoi;

public class Disc {
    private final int weight;

    Disc(int weight) {
        this.weight = weight;
    }

    boolean isHeavierThan(Disc anotherDisc) {
        return weight > anotherDisc.weight;
    }

    @Override
    public String toString() {
        return  weight + " ";
    }
}
