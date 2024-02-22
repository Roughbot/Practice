import java.util.Scanner;

public class matrixTranspose {
    public static void matrixTranspose(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i< t; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][m];
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++){
                    arr[j][k] = sc.nextInt();
                }
            }

            int[][] answer = new int[m][n];
            for(int j = 0; j < m; j++){
                for(int k = 0; k < n; k++){
                    answer[j][k] = arr[k][j];
                }
            }

        }

    }
}
