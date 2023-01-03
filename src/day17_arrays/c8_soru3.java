package day17_arrays;

import java.util.Arrays;

public class c8_soru3 {
    public static void main(String[] args) {
//    Soru 3- Verilen 2 katli bir array'de her bir ic array’deki elementleri toplayip, yeni
//        olusturacagimiz tek katli bir array'e bu toplamlari atayin.
//
//        input: int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
//
//        output: [10, 3, 12, 10, 9]

        int[][] mdaArr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] Arr = new int[mdaArr.length];


        for (int i = 0; i < mdaArr.length; i++) {
            for (int j = 0; j < mdaArr[i].length; j++) {
                Arr[i]+= mdaArr[i][j];

            }

        }
        System.out.println(Arrays.toString(Arr));

    }
}
