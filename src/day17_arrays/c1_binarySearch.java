package day17_arrays;

import java.util.Arrays;

public class c1_binarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,1,5,3,7};

        System.out.println(Arrays.binarySearch(arr, 2)); //  -5
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));       // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(Arrays.binarySearch(arr, 2));  // 1
        System.out.println(Arrays.binarySearch(arr, 8));  //
        System.out.println(Arrays.binarySearch(arr, 212)); //
    }
}
