package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = Math.abs(position().getX() - dest.getX());
        Cell[] steps = new Cell[size];
        int deltaX = position().getX() < dest.getX() ? 1 : -1;
        int deltaY = position().getY() < dest.getY() ? 1 : -1;
        int posX = position().getX();
        int posY = position().getY();
        for (int index = 0; index < size; index++) {
            posX = deltaX + posX;
            posY = deltaY + posY;
            steps[index] = Cell.findBy(posX, posY);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(source.getX() - dest.getX()) == Math.abs(source.getY() - dest.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
