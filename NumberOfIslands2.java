import java.util.*;

public class NumberOfIslands2 {

    public static void main(String[] args){
        int m = 2;
        int n = 2;
        int[][] positions = new int[][]{{0,0},{1,1},{0,1}};
        List<Integer> distinct = numIslands2(m, n, positions);
        for(int i : distinct){
            System.out.print(i + " ");
        }
    }

    public static List<Integer> numIslands2(int m, int n, int[][] positions) {
        if(positions.length == 0 || m == 0 || n == 0){
            return new ArrayList<>();
        }
        int[][] matrix = new int[m][n];
        List<Integer> answer = new ArrayList<>();
        int islandCounter = 0;
        int nameCounter = 0;
        int[] adjacent = new int[4];
        for(int[] island : positions){

            int distinct = getAdjacentInfo(island[0], island[1], matrix, adjacent);
            islandCounter = distinct == 0 ? islandCounter + 1 : islandCounter - distinct + 1;
            matrix[island[0]][island[1]] = ++nameCounter;
            bubble(island[0], island[1], matrix, nameCounter, new boolean[m][n]);
            answer.add(islandCounter);
        }
        return answer;
    }

    private static void bubble(int i, int j, int[][] matrix, int name, boolean[][] visited){
        if(i < 0 || i == matrix.length || j < 0 || j == matrix[0].length || matrix[i][j] == 0 || visited[i][j]){
            return;
        }
        matrix[i][j] = name;
        visited[i][j] = true;
        bubble(i - 1, j, matrix, name, visited);
        bubble(i, j - 1, matrix, name, visited);
        bubble(i + 1, j, matrix, name, visited);
        bubble(i, j + 1, matrix, name, visited);
    }

    private static int getAdjacentInfo(int i, int j, int[][] matrix, int[] adjacent){
        Arrays.fill(adjacent, 0);
        adjacent[0] = j - 1 < 0 ? 0 : matrix[i][j - 1];
        adjacent[1] = i - 1 < 0 ? 0 : matrix[i - 1][j];
        adjacent[2] = j + 1 == matrix[0].length ? 0 : matrix[i][j + 1];
        adjacent[3] = i + 1 == matrix.length ? 0 : matrix[i + 1][j];

        Set<Integer> distinct = new HashSet<>();
        for(int m = 0; m < 4; m++){
            if(adjacent[m] > 0){
                distinct.add(adjacent[m]);
            }
        }
        return distinct.size();
    }
}
