package com.dzioba.Hanoi;

import java.util.ArrayList;
import java.util.List;

public class HanoiGame {
    private Board board;
    private final int discs;
    private List<Move> moves;

    public HanoiGame(int discs, List<Move> moves) {
        this.board = createNewBoard(discs);
        this.discs = discs; // TODO: Implement discs must be higher than 1 with exception throwing/handling
        this.moves = moves;
    }

    private Board createNewBoard(int discs) {
        return new Board(discs, new ArrayList<>());
    }

    public void moveDiscsUntilFinished(int discWeight, Tower from, Tower middle, Tower to) {
        if(discWeight == 1)
            moves.add(board.move(from, to));
        else {
            moveDiscsUntilFinished(discWeight - 1, from, to, middle);
            moves.add(board.move(from, to));
            moveDiscsUntilFinished(discWeight - 1, middle, from, to);
        }
    }

    public List<Move> start() {
        Tower from = board.getTower(Place.START);
        Tower middle = board.getTower(Place.MIDDLE);
        Tower to = board.getTower(Place.END);
        moveDiscsUntilFinished(discs, from, middle, to);
        return moves;
    }
}
