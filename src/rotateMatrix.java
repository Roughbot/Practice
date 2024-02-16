import java.util.ArrayList;

public class rotateMatrix {
    public static int[][] rotateTheMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for( int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                if(i < j){
                    matrix[i][j] = matrix[i][j]^matrix[j][i];
                    matrix[j][i] = matrix[j][i]^matrix[i][j];
                    matrix[i][j] = matrix[j][i]^matrix[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            int low = 0;
            int high = m-1;
            while(low < high){
                matrix[i][low] = matrix[i][low]^matrix[i][high];
                matrix[i][high] = matrix[i][high]^matrix[i][low];
                matrix[i][low] = matrix[i][low]^matrix[i][high];
                low++;
                high--;
            }
        }

        return matrix;
    }

    public static void rotateMatrix90(ArrayList<ArrayList<Integer>> matrix){

    }

}
