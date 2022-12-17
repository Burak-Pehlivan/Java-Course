package Java_Array;

import java.util.Arrays;

public class c4_StringiArrayeCevirmek {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        str.split(" "); // bosluga gore ayir.

        String[] kelimeler = str.split(" ");   // [Java, cok, guzel]
        System.out.println(Arrays.toString(kelimeler));

        String[] harfler = str.split("");
        System.out.println(Arrays.toString(harfler));  //[J, a, v, a,  , c, o, k,  , g, u, z, e, l]

        String[] kelimeler2 = str.split("cok");
        System.out.println(Arrays.toString(kelimeler2));  // [Java ,  guzel]



    }
}
