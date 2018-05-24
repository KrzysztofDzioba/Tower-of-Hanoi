package com.dzioba.Hanoi;

import java.util.List;

class Board {
    private final List<Tower> towers;

    Board(int discs, List<Tower> towers) {
        this.towers = towers;
        towers.add(new Tower(discs));
        towers.add(new Tower(Place.MIDDLE));
        towers.add(new Tower(Place.END));
    }

    Tower getTower(Place place) {
        return towers.stream().filter(towerPlace -> towerPlace.getPlace().equals(place)).findAny().orElse(null);
    }

    Move move(Tower from, Tower to) {
        Disc movingDisc = from.pop();
        to.push(movingDisc);
        return new Move(from, to, movingDisc);
    }
}
