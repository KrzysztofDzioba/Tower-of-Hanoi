package com.dzioba.Hanoi;

import java.util.List;

public class Board {
    List<Tower> towers;

    public Board() {
        towers.add(new Tower(Place.START));
        towers.add(new Tower(Place.MIDDLE));
        towers.add(new Tower(Place.END));
    }

    public Tower getTower(Place place) {
        return towers.stream().filter(towerPlace -> towerPlace.getPlace().equals(place)).findAny().orElse(null);
    }
}
