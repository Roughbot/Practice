public class sizeOfSmallestSubArray {
    //Given an array of integer, find the size of the smallest subarray containing both the min and max elements of the array.
    //input:[1,2,3,1,3,4,4]
    //output: 3
    public static int sizeOfSmallestSubArray(int[] arr){

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] == max){
                        answer = Math.min(answer, j-i+1);
                        break;
                    }
                }
            }
            if(arr[i] == max){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] == min){
                        answer = Math.min(answer, j-i+1);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
