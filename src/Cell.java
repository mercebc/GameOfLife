/**
 * Created by merce.bauza on 12/07/2017.
 */
public class Cell {

    private int x;
    private int y;

    //constructor
    public Cell(int x, int y){
       this.x = x;
       this.y = y;
    }
    //getterX
    public int getX() {
        return x;
    }
    //getterY
    public int getY() {
        return y;
    }

    //compares the objects (different address) returns true if they are the same value
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (x != cell.x) return false;
        return y == cell.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    //returns a string representing your object (toString is a method of Object)
    @Override
    public String toString(){
        return "("+ this.x + "," + this.y +")";
    }
}