package day16_arrays;

import java.util.Arrays;

public class c4_Soru {
    public static void main(String[] args) {

        //Verilen bir String Array'de
        // istenen bir harfi iceren kelimeleri silip yerine null yazdirin

        String[] isimler = {"selami","hakan","topal", "erden"};
        String silinecekHarf = "a";

        for (int i = 0; i < isimler.length; i++) {

            if(isimler[i].contains(silinecekHarf)){
                isimler[i] = null;
            }
        }

        System.out.println(Arrays.toString(isimler));

    }
}
