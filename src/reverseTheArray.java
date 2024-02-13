public class reverseTheArray {
    public static int[] reverseTheGivenArray(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            nums[i] = nums[i] ^ nums[j];
            nums[j] = nums[i] ^ nums[j];
            nums[i] = nums[i] ^ nums[j];
            i++;
            j--;
        }

        return nums;
    }


}
