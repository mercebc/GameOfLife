import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by merce.bauza on 28/06/2017.
 */
public class GridTest {

    @Test
    public void newGridEmpty() {
        Grid grid = new Grid();

        assertEquals(new ArrayList<>(),grid.cellsAlive());
    }

    @Test
    public void allDeadNextGenerationAllDead() {
        Grid grid = new Grid();

        grid.nextGeneration();

        assertEquals( new ArrayList<>(),grid.cellsAlive());
    }

    @Test
    public void cellAloneDiesInNextGeneration(){
        Grid grid = new Grid();
        grid.setCellsAlive(2,3);
        grid.nextGeneration();

        assertEquals(new ArrayList<>(), grid.cellsAlive());
    }

    @Test
    public void something() {
        boolean X = true;
        boolean O = false;

        boolean[][] before = new boolean[][]{
                { O, O, O, O, O },
                { O, O, X, O, O },
                { O, O, X, O, O },
                { O, O, X, O, O },
                { O, O, O, O, O }
        };
        boolean[][] after = new boolean[][]{
                { O, O, O, O, O },
                { O, O, O, O, O },
                { O, X, X, X, O },
                { O, O, O, O, O },
                { O, O, O, O, O }
        };

//        new Game().nextGeneration(before);

        assertEquals(after, new Game().nextGeneration(before));
    }

    @Test
    public void tenByTenGrid() {
        boolean X = true;
        boolean O = false;

        boolean[][] before = new boolean[][]{
                { O, O, O, O, O, O, O, O, O, O },
                { O, O, X, O, O, O, O, O, O, O },
                { O, O, X, O, O, O, O, O, O, O },
                { O, O, X, O, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O },
                { O, O, X, O, O, O, O, O, O, O },
                { O, O, X, O, O, O, O, O, O, O },
                { O, O, X, O, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O }
        };
        boolean[][] after = new boolean[][]{
                { O, O, O, O, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O },
                { O, X, X, X, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O },
                { O, X, X, X, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O },
                { O, O, O, O, O, O, O, O, O, O }
        };

//        new Game().nextGeneration(before);

        assertEquals(after, new Game().nextGeneration(before));
    }

    @Test
    public void xxxxxxx() {
        boolean X = true;
        boolean O = false;

        boolean[][] before = new boolean[][]{
                { O, O, O, X, O },
                { X, O, X, O, O },
                { O, O, X, O, O },
                { O, O, X, O, X },
                { X, X, O, O, O }
        };
        new Game().run(before, 100);

//        new Game().nextGeneration(before);

    }

//    @Test
//    public void cellWithTwoNeighboursSurvivesInNextGeneration(){
//        Grid grid = new Grid();
//        grid.setCellsAlive(2,3);
//        grid.setCellsAlive(1,2);
//        grid.setCellsAlive(3,2);
//        grid.nextGeneration();
//
//        ArrayList<Cell> expected = new ArrayList<Cell>();
//        expected.add(new Cell(2,3));
//        assertEquals( expected,grid.cellsAlive());
//    }

    @Test
    public void setCellsAlive(){
        Grid grid = new Grid();
        grid.setCellsAlive(4,8);
        grid.setCellsAlive (2,4);
        grid.setCellsAlive(3,6);

        ArrayList<Cell> expected = new ArrayList<Cell>();
        expected.add(new Cell(4,8));
        expected.add(new Cell(2,4));
        expected.add(new Cell(3,6));

        assertEquals (expected,grid.cellsAlive());
    }


}