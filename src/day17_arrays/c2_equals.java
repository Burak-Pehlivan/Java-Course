package day17_arrays;

import java.util.Arrays;

public class c2_equals {
    public static void main(String[] args) {

        int[] arr1 = {1,3,7};
        int[] arr2 = {3,1,7};

        System.out.println(Arrays.equals(arr1, arr2)); // false

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2)); // true

    }
}
