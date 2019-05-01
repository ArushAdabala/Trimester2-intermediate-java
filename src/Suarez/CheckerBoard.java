package Suarez;

public class CheckerBoard {
    public static boolean[][] makeGrid(int rows, int cols){
        boolean [][] grid;
        grid = new boolean[rows][cols];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(i%2 != 1) {
                    if (j % 2 != 1) {
                        grid[i][j] = false;
                    }
                    else if (j % 2 == 1){
                        grid[i][j] = true;
                    }
                }
                else if(i%2 == 1){
                    if (j % 2 != 1) {
                        grid[i][j] = true;
                    }
                    else if (j % 2 == 1){
                        grid[i][j] = false;
                    }
                }
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        boolean[][] grid = makeGrid(7, 8);
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if(grid[row][column] == false){
                    System.out.print("false ");
                }
                else{
                    System.out.print("true ");
                }
            }
            System.out.println();
        }

    }
}
