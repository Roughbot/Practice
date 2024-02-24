public class sizeOfSmallestSubArray {
    //Given an array of integer, find the size of the smallest subarray containing both the min and max elements of the array.
    //input:[1,2,3,1,3,4,4]
    //output: 3
    public static int sizeOfSmallestSubArray1(int[] arr){

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

    public static int sizeOfSmallestSubArray2(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int j : arr){
            min = Math.min(min, j);
            max = Math.max(max, j);
        }

        int answer = Integer.MAX_VALUE;
        int latest_max = -1;
        int latest_min = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                latest_min = i;
                if(latest_max != -1){
                    answer = Math.min(answer, Math.abs(latest_max-latest_min)+1);

                }
            }
            if(arr[i] == max){
                latest_max = i;
                if(latest_min != -1){
                    answer = Math.min(answer,Math.abs(latest_min-latest_max)+1);
                }
            }
        }
        return answer;
    }
}
