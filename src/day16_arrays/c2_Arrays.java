package day16_arrays;

import java.util.Arrays;

public class c2_Arrays {
    public static void main(String[] args) {
        // verilen bir string arrayin tum elementlerini yazdirin.

        String[] isimler = {"selami","hakan","topal"};
        System.out.println(Arrays.toString(isimler)); // [selami, hakan, topal]

        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }
    }
}
