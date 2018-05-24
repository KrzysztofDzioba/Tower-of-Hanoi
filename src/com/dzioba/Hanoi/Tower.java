package com.dzioba.Hanoi;

import java.util.Stack;

class Tower extends Stack<Disc> {

    private final Place place;

    Tower(Place place) {
        this.place = place;
    }

    Tower(int discs) {
        this(Place.START);
        createAndPutDiscsOnTower(discs);
    }

    @Override
    public String toString() {
        return "tower " + place.toString();
    }

    Place getPlace() {
        return place;
    }

    @Override
    public Disc push(Disc item) {
        if (this.isEmpty())
            return super.push(item);
        if (item.isHeavierThan(this.peek()))
            throw new IllegalArgumentException("Cannot put heavier disc on lighter.");
        return super.push(item);
    }

    private void createAndPutDiscsOnTower(int discs) {
        for (int weight = discs; weight > 0; weight--) {
            this.push(new Disc(weight));
        }
    }
}
