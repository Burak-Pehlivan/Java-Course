package day16_arrays;

import java.util.Arrays;

public class c9_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};

        // arr1 = {3,5,2,1};  // kizar
        // arr1 = {2,723,12,2}; // kizar

        // arr1 = new int[5];   // [0, 0, 0, 0, 0]

        int[] temp = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr1)); // [1, 2, 3]
        System.out.println(Arrays.toString(temp)); // [1, 2, 3, 0, 0]
    }
}
