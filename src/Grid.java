import java.util.ArrayList;

/**
 * Created by merce.bauza on 05/07/2017.
 */
public class Grid {
     ArrayList<Cell> cellsAlive = new ArrayList<>();

     public ArrayList<Cell> cellsAlive() {
        return cellsAlive;
    }

    public void nextGeneration() {
        Cell firstCell = cellsAlive.get(0);
        ArrayList<Cell> neighbours = new ArrayList<>();
        int count = 0;

        neighbours.add(new Cell(firstCell.getX(), firstCell.getY()-1));
        neighbours.add(new Cell(firstCell.getX(), firstCell.getY()+1));
        neighbours.add(new Cell(firstCell.getX()-1, firstCell.getY()-1));
        neighbours.add(new Cell(firstCell.getX()-1, firstCell.getY()));
        neighbours.add(new Cell(firstCell.getX()-1, firstCell.getY()+1));
        neighbours.add(new Cell(firstCell.getX()+1, firstCell.getY()-1));
        neighbours.add(new Cell(firstCell.getX()+1, firstCell.getY()));
        neighbours.add(new Cell(firstCell.getX()+1, firstCell.getY()+1));

        for (Cell c : neighbours){
            if (cellsAlive.contains(c)){
                count++;
            }
        }

        if (count < 2){
            cellsAlive.remove(firstCell);
        }
    }

    public void setCellsAlive(int x, int y) {
        Cell cell = new Cell(x,y);
        cellsAlive.add(cell);
    }
}
