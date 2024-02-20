import java.util.Scanner;

public class max1CountInMatrix {
    public static int maximumOnes(int[][] matrix){
        int max_count = 0;
        int index = 0;

        int n = matrix.length;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            if(count > max_count){
                max_count = count;
                index = i;
            }

        }
        return index;
    }
    public static int maximumOnes2(int[][] matrix){
        for(int i = 0; i < matrix[0].length;i++ ){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] == 1){
                    return j;
                }
            }
        }
        return -1;
    }
    public static int maximumOnes4(int[][] matrix){

        int index = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;
        while(i < n && j >= 0){
            if(matrix[i][j] == 1){
                j--;
                index = i;
            }else{
                i++;
            }
        }
        return index;
    }

}
