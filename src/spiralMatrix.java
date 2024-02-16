import java.util.ArrayList;

public class spiralMatrix {

    public static ArrayList<Integer> printSpiralMatrix(int[][] matrix){
        int T = 0;
        int B = matrix.length-1;
        int L = 0;
        int R = matrix[0].length-1;
        ArrayList<Integer> answer = new ArrayList<>();
        while(T <= B && L <= R){
            if(L <= R) {
                for (int k = L; k <= R; k++) {
                    answer.add(matrix[T][k]);
                }
                if(answer.size() == matrix.length * matrix[0].length) break;
            }
            T++;
            if(T <= B){
                for(int k = T ; k <= B ; k++){
                    answer.add(matrix[k][R]);
                }
                if(answer.size() == matrix.length * matrix[0].length) break;
            }
            R--;
            if(L <= R){
                for(int k = R ; k >= L ; k--){
                    answer.add(matrix[B][k]);
                }
                if(answer.size() == matrix.length * matrix[0].length) break;
            }
            B--;
            if(T <= B){
                for(int k = B ; k >= T; k--){
                    answer.add(matrix[k][L]);
                }
                if(answer.size() == matrix.length * matrix[0].length) break;
            }
            L++;
        }
        return answer;
    }

}
