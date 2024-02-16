import java.util.ArrayList;

public class spiralMartix2 {

    public static void printSpiralMatrix2(int n){
        int[][] answer = new int[n][n];
        int T = 0, B = n-1, L = 0, R = n-1;
        int count = 1;
        while(T <= B && L <= R){
                for (int k = L; k <= R; k++) {
                    answer[T][k] = count;
                    count++;
                }

            T++;
            if(T <= B){
                for(int k = T ; k <= B ; k++){
                    answer[k][R] = count;
                    count++;
                }
            }
            R--;
            if(L <= R){
                for(int k = R ; k >= L ; k--){
                    answer[B][k] = count;
                    count++;
                }
            }
            B--;
            if(T <= B){
                for(int k = B ; k >= T; k--){
                    answer[k][L] = count;
                    count++;
                }
            }
            L++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(answer[i][j] + " ");
            }
        }

    }

}