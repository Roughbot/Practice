public class checkGivenNumberIsPowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static boolean isPowerOfTwo2(int n){
        int setBitCount = 0;
        while(n >0){
            setBitCount += n & 1;
            n >>=1;
        }
        return setBitCount == 1;
    }
}
