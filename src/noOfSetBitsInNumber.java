public class noOfSetBitsInNumber {

    public static int numberOfSetBits(int n){
        int setBits = 0;
        while(n>0){
            setBits++;
            n = n&(n-1);
        }

        return setBits;
    }
}
