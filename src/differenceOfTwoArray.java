import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class differenceOfTwoArray {
    public static ArrayList<ArrayList<Integer>> findDifferenceOfTwoArray(int[] arr1, int[] arr2){
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();
        for(int i: arr2){
            num2.add(i);
        }
        for(int i: arr1){
            num1.add(i);
        }

        for(int i: num1){
            if(!num2.contains(i)){
                answer.get(0).add(i);
            }
        }
        for(int i: num2){
            if(!num1.contains(i)){
                answer.get(1).add(i);
            }
        }

        return answer;
    }
}
