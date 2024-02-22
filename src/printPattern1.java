public class printPattern1 {
    //Given a number N print the pattern as shown in the sample output.
    //input:
    // N = 4
    //output:
    //[0,0,0,1]
    //[0,0,2,1]
    //[0,3,2,1]
    //[4,3,2,1]
    public static int[][] printPattern(int N){
        int[][] answer = new int[N][N];

        for(int i = 0; i < N; i++ ){
            int j = N-1;
            for(int val = 1; val <= i+1 ;val++){
                answer[i][j] = val;
                j--;
            }
        }
        return answer;
    }
}
