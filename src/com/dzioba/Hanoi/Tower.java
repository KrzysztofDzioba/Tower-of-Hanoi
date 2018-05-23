package com.dzioba.Hanoi;

import java.util.Stack;

public class Tower extends Stack<Disc> {

    private Place place;

    public Tower(Place place) {
        this.place = place;
    }

    public Tower(Place place, int discs) {
        this(place);
        createAndPutDiscsOnTower(discs);
    }

    @Override
    public String toString() {
        return "tower " + place.toString();
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public Disc push(Disc item) {
        if(this.isEmpty())
            return super.push(item);
        if(item.isHeavierThan(this.peek()))
            throw new IllegalArgumentException("Cannot put heavier disc on lighter.");
        return super.push(item);
    }

    private void createAndPutDiscsOnTower(int discs) {
        for(int weight = discs; discs > 0; discs--) {
            this.push(new Disc(weight));
        }
    }
}
