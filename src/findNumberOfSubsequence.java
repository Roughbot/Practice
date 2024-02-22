public class findNumberOfSubsequence {
    //Given a string s of lowercase letters, find out how many subsequence of "ag" exist in the string.
    public static int findTheNumberOfSubsequence(String s){
        int answer =0;
        int a_count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                a_count++;
            }
            else if(s.charAt(i) == 'g'){
                answer += a_count;
            }
        }
        return answer;

    }
}
