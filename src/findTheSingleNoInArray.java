public class findTheSingleNoInArray {
    public static int findTheNumber(int[] nums ){
        int answer = 0;

        for (int num : nums) {
            answer = answer ^ num;

        }

        return answer;
    }
}
