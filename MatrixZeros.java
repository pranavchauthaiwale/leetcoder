import java.util.Arrays;

public class MatrixZeros {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        for(int[] row : matrix){
            System.out.println("" + Arrays.toString(row));
        }
        setZeros(matrix);
        for(int[] row : matrix){
            System.out.println("" + Arrays.toString(row));
        }
    }
    public static void setZeros(int[][] matrix){
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1; cols[j] = 1;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(rows[i] == 1 || cols[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
