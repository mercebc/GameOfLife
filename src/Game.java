/**
 * Created by merce.bauza on 28/06/2017.
 */
public class Game {

    public boolean[][] nextGeneration (boolean[][] thisGeneration){
     boolean[][] nextGeneration = new boolean[thisGeneration.length][thisGeneration.length];

//        print(thisGeneration);

     for(int i=0; i<thisGeneration.length; i++){
         for(int j=0; j<thisGeneration.length; j++) {
//             System.out.println("" + i + ", " + j + ": " + thisGeneration[i][j]);

             int count = 0;
             if (isAlive(thisGeneration, i, j - 1) == true) {
                 count++;
             }
             if (isAlive(thisGeneration, i, j + 1) == true) {
                 count++;
             }
             if (isAlive(thisGeneration, i - 1, j - 1) == true) {
                 count++;
             }
             if (isAlive(thisGeneration, i - 1, j) == true) {
                 count++;
             }
             if (isAlive(thisGeneration, i - 1, j + 1) == true) {
                 count++;
             }
             if (isAlive(thisGeneration, i + 1, j - 1) == true) {
                 count++;
             }
             if (isAlive(thisGeneration, i + 1, j) == true) {
                 count++;
             }
             if (isAlive(thisGeneration, i + 1, j + 1) == true) {
                 count++;
             }

             if (thisGeneration[i][j] == true) {
                 if (count < 2) {
                     nextGeneration[i][j] = false;
                 }
                 if (count == 2 || count == 3) {
                     nextGeneration[i][j] = true;
                 }
                 if (count > 3) {
                     nextGeneration[i][j] = false;
                 }
             }

             if (thisGeneration[i][j] == false) {

                 if (count == 3) {
                     nextGeneration[i][j] = true;
                 }
             }
         }
     }
//     print(nextGeneration);

    return nextGeneration;
    }


    public boolean isAlive(boolean[][] board, int i, int j) {
        if (i < 0 || i >= board.length) {
            return false;
        } else if(j < 0 || j >= board.length) {
            return false;
        } else {
            return board[i][j];
        }
    }

    public void print(boolean[][] board) {
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j <board[i].length; j++) {
                System.out.print(board[i][j] ? "X" : ".");
            }
            System.out.println(",");
        }
    }

    public void run(boolean[][] board, int generations) {
        boolean[][] newBoard = board;
        print(newBoard);
        for (int i = 0; i < generations; i++) {
            System.out.println("generation " + i);
            newBoard = nextGeneration(newBoard);
            print(newBoard);
        }
    }

}
