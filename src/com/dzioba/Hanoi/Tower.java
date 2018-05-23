package com.dzioba.Hanoi;

import java.util.Stack;

public class Tower extends Stack<Disc> {

    private Place place;

    public Tower(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "tower " + place.toString();
    }

    public Place getPlace() {
        return place;
    }
}
