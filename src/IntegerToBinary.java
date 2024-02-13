public class IntegerToBinary {
    public static String integerToBinary(int n){
        String binary = "";
        while(n >0){
            int remainder = n%2;
            binary = remainder + binary;
            n = n/2;
        }

        return binary;

    }
}
