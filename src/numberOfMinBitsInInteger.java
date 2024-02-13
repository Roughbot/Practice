public class numberOfMinBitsInInteger {
    public static int numberOfBits(int n){
        return (int) (Math.log(n) / Math.log(2)) + 1;
    }

    public static int numberOfBits2(int n){
        int count = 0;
        while(n > 0){
            n = n >> 1;
            count++;
        }
        return count;
    }
}
