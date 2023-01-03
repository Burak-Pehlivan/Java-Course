package day16_arrays;

import java.util.Arrays;

public class c8_Soru {
    public static void main(String[] args) {
        //Verilen bir array'deki tum elementleri bir saga kaydirin.
        //sondaki elementi de basa tasiyacak bir method olusturun
        // arrayi yeni haliyle kaydedin.
        // orn : input : [4,5,6,7] arrayin son hali : [7,4,5,6] olacak

        int[] arr = {4,5,6,7}; // [7, 4, 5, 6]
        arr = elementKaydir(arr);
        System.out.println(Arrays.toString(arr));

       // System.out.println(elementKaydir(new int[]{2, 3, 4, 5, 6, 6, 7, 8, 9, 0, 1, 1, 1, 1})); // [1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 0, 1, 1, 1]
    }

    public static int[] elementKaydir(int[] element){
        int[] array = new int[element.length];

        for (int i = 0; i < element.length; i++) {

            if(i == element.length-1){
                array[0]= element[i];
            }else {
                array[i+1]= element[i];
            }
        }
        //System.out.println(Arrays.toString(array));
        return array;
    }
}
