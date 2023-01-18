package day17_arrays;

import java.util.Arrays;

public class c9_soru2 {


    // Soru 2- Verilen 2 katli bir array'de ayni index'e sahip elementleri toplayip, yeni
//            olusturacagimiz tek katli bir array’e bu toplamlari atayin.
//
//           input: int[][] arr = {{3,4,5}, {2,3,6,7}};
//
//           output: [5, 7, 11]

    public static void main(String[] args) {

        int[][] arr = {{3,4,5}, {2,3,6,7},{5,2,4}};
        int enKisaInnerArrayLength = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length< enKisaInnerArrayLength){
                enKisaInnerArrayLength=arr[i].length;
            }
        }
        
        int[] arraylerToplami = new int[enKisaInnerArrayLength];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < enKisaInnerArrayLength; j++) {
                arraylerToplami[i] += arr[j][i];
            }
        }

        System.out.println(Arrays.toString(arraylerToplami));
    }
}
