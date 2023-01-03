package day16_arrays;

import java.util.Arrays;

public class c12_BinarySearch {
    public static void main(String[] args) {


        //binary tree javanin kullandigi ozel bir siralama yontemidir.
        // binarySearch methodu binaryTree ozelligini kullandigindan
        // sirali olmayan array'lerde dogru sonuc donduremeyebilir.
        // Eger binarySearch() kullanilacaksa
        // oncesinde MUTLAKA sort() kullanilmalidir.

        int[] arr = {2,6,9,16,7,15,1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 15)); //
    }
}
