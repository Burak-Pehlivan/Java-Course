package day17_arrays;

import java.util.Arrays;

public class c4_multiDimensionalArrays {

    public static void main(String[] args) {

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        // multi dimensional arraylerde en distaki arraye outer array, icerideki arraylere ise inner arrays denir.

        System.out.println(arr.length);  // 5
        System.out.println(arr[2].length); // 3
        System.out.println(arr[2][1]);   // 4    in {3,4,5}

        System.out.println(Arrays.toString(arr[3]));  //  [10]
        // inner arrays :
        // arr[0] =>  {3,1,2,4}
        // arr[1] =>  {1,2}
        // arr[2] =>  {3,4,5}
        // arr[3] =>  ..
        // arr[4] =>  ..


        System.out.println(Arrays.toString(arr));  // [[I@58372a00, [I@4dd8dc3, [I@6d03e736, [I@568db2f2, [I@378bf509]
        System.out.println(Arrays.deepToString(arr));  // [[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]


    }
}
