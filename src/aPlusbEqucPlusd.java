import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class aPlusbEqucPlusd {
    public static int[] check4sums(int[] arry){
        int[] answer = new int[4];
        for(int i = 0; i < arry.length -1; i++){
            for(int j = i +1; j< arry.length-1;j++){
                for(int k = j+1; k< arry.length-1; k++){
                    for(int l = k+1; l< arry.length-1; l++){
                        if(arry[i] + arry[j] == arry[k] + arry[l]){
                            answer[0] = arry[i];
                            answer[1] = arry[j];
                            answer[2] = arry[k];
                            answer[3] = arry[l];
                            return answer;
                        }
                    }
                }
            }
        }

        return answer;
    }
    public static boolean check4sums2(int[] arry){
        HashMap<Integer, List<Integer>> sums = new HashMap<>();
        for(int i = 0; i < arry.length-1; i++){
            for(int j = i+1; j < arry.length; j++){
                if(sums.containsKey(arry[i]+arry[j])){
                    List<Integer> temp = sums.get(arry[i]+arry[j]);
                    if(temp.get(0) != i && temp.get(1) != j && temp.get(0) != j && temp.get(1) != i){
                        return true;
                    }
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    sums.put(arry[i]+arry[j], temp);
                }
            }
        }
        return false;
    }

}
