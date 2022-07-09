package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void Position() {
        BishopBlack bp = new BishopBlack(Cell.C1);
        assertThat(bp.position(), is(Cell.C1));
    }

    @Test
    public void Way() {
        BishopBlack bp = new BishopBlack(Cell.C1);
        assertThat(bp.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void Copy() {
        Figure bp = new BishopBlack(Cell.A1);
        Figure bp2 = bp.copy(Cell.B2);
        assertThat(bp2.position(), is(Cell.B2));
    }
}