public class reverseTheArray {
    public static int[] reverseTheGivenArray(int[] nums, int i, int j) {
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
