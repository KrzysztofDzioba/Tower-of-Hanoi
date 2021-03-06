package com.dzioba.Hanoi;

import java.util.ArrayList;
import java.util.List;

class HanoiGame {
    private final Board board;
    private final int discs;
    private final List<Move> moves;

    HanoiGame(int discs, List<Move> moves) {
        this.board = createNewBoard(discs);
        this.moves = moves;
        this.discs = discs;
    }

    private Board createNewBoard(int discs) {
        return new Board(discs, new ArrayList<>());
    }

    private void moveDiscsUntilFinished(int discWeight, Tower from, Tower middle, Tower to) {
        if (discWeight == 1)
            moves.add(board.move(from, to));
        else {
            moveDiscsUntilFinished(discWeight - 1, from, to, middle);
            moves.add(board.move(from, to));
            moveDiscsUntilFinished(discWeight - 1, middle, from, to);
        }
    }

    List<Move> start() {
        Tower from = board.getTower(Place.START);
        Tower middle = board.getTower(Place.MIDDLE);
        Tower to = board.getTower(Place.END);
        moveDiscsUntilFinished(discs, from, middle, to);
        return moves;
    }


}
