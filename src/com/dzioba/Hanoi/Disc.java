package com.dzioba.Hanoi;

public class Disc {
    private int weight;

    public boolean isHeavier(Disc anotherDisc) {
        return weight > anotherDisc.weight;
    }

}
