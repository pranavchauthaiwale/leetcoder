import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {

    public void setZero(int matrix[][]){

        Set<Integer> rowSet = new HashSet<Integer>();
        Set<Integer> colSet = new HashSet<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                    break;
                }
            }
        }
        for( Object i : rowSet){

        }
        for(Integer j : colSet){

        }
    }

    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
