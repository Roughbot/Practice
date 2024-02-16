import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//      System.out.println(Arrays.toString(reverseTheArray.reverseTheGivenArray(arr)));
//        System.out.println(Arrays.toString(rotateTheArray.rotateTheGivenArray(arr, 3)));
//        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        System.out.println(spiralMatrix.printSpiralMatrix(arr));
//        spiralMartix2.printSpiralMatrix2(4);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix.rotateTheMatrix(arr);
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}