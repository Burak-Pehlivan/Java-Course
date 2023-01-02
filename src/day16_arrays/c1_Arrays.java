package day16_arrays;

import java.util.Arrays;

public class c1_Arrays {
    public static void main(String[] args) {

        String[] arr1 = new String[4];

        int [] arr2 = {3,4,5,6,7,8,9,10};

        System.out.println(arr2[1]); // 4

        System.out.println(arr1[3]); // null

      //  System.out.println(arr1[8]); //ArrayIndexOutOfBoundsException

        arr2[2]= 15;
        arr2[0]= 126;

        System.out.println(arr2);  // [I@58372a00

        System.out.println(Arrays.toString(arr2)); // [126, 4, 15, 6, 7, 8, 9, 10]
        System.out.println(Arrays.toString(arr1)); // [null, null, null, null]
    }
}
