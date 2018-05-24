package com.dzioba.Hanoi;

public class Disc {
    private int weight;

    public Disc(int weight) {
        this.weight = weight;
    }

    public boolean isHeavierThan(Disc anotherDisc) {
        return weight > anotherDisc.weight;
    }

    @Override
    public String toString() {
        return  weight + " ";
    }
}
