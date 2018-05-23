package com.dzioba.Hanoi;

import java.util.List;

public class HanoiGame {
    private Board board;
    private int discs;
    private List<Move> moves;

    public HanoiGame(int discs) {
        this.board = createNewBoard();
        this.discs = discs;
    }

    private Board createNewBoard() {
        return new Board();
    }

    public void start() {

    }
}
