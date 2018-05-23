package com.dzioba.Hanoi;

import java.util.List;

public class Board {
    List<Tower> towers;

    public Board(int discs, List<Tower> towers) {
        this.towers = towers;
        towers.add(new Tower(Place.START, discs));
        towers.add(new Tower(Place.MIDDLE));
        towers.add(new Tower(Place.END));
    }

    public Tower getTower(Place place) {
        return towers.stream().filter(towerPlace -> towerPlace.getPlace().equals(place)).findAny().orElse(null);
    }

    public Move move(Tower from, Tower to) {
        Disc movingDisc = from.pop();
        to.push(movingDisc);
        return new Move(from, to, movingDisc);
    }
}
