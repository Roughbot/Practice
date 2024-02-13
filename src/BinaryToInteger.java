public class BinaryToInteger {
    public static int binaryToInteger(String binary){
        int answer = 0;
        int power = 0;
        for(int i = binary.length() -1; i >=0; i--){
            if(binary.charAt(i)=='1'){
                int number = (int)Math.pow(2, power);
                answer += number;
            }
            power++;
        }

        return answer;
    }
}
