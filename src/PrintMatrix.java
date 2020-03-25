import java.util.ArrayList;

public class PrintMatrix {
    private int[][] direct = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int rows;
    private int cols;

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix == null){
            return res;
        }
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        if(rows == 0 || cols == 0){
            return res;
        }
        boolean [][]marked = new boolean[rows][cols];
        int totalNum = rows * cols;
        int i = 0, j = 0;
        int count = 0;
        int direction = 0;
        while(count < totalNum){
            res.add(matrix[i][j]);
            marked[i][j] = true;
            count++;
            if(!judge(marked, i + direct[direction][0], j + direct[direction][1])){
                direction = (direction + 1) % 4;
            }
            i = i + direct[direction][0];
            j = j + direct[direction][1];
        }
        return res;
    }

    private boolean judge(boolean [][]marked, int i, int j){
        return 0 <= i && i < rows && 0 <= j && j < cols && !marked[i][j];
    }
}
