package ru.job4j.tictactoe.ships;

import ru.job4j.tictactoe.Cell;

import java.util.List;

public interface Ship {
    List<Cell> position();

    List<Cell> border();
}
