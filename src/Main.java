import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//      System.out.println(Arrays.toString(reverseTheArray.reverseTheGivenArray(arr)));
//        System.out.println(Arrays.toString(rotateTheArray.rotateTheGivenArray(arr, 3)));
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralMatrix.printSpiralMatrix(arr));
    }
}