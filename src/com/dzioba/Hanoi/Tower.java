package com.dzioba.Hanoi;

import java.util.Stack;

public class Tower extends Stack<Disc> {

    Place place;


    @Override
    public String toString() {
        return "Tower: " + place.toString();
    }
}
