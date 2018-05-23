package com.dzioba.Hanoi;

public class Disc {
    private int weight;

    public Disc(int weight) {
        this.weight = weight;
    }

    public boolean isHeavierThan(Disc anotherDisc) {
        return weight > anotherDisc.weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return  weight + " ";
    }
}
