package day17_arrays;


import java.util.Arrays;

public class c3_stringSplit {
    public static void main(String[] args) {

        String str = "Java ile hayat daha kolay";

        String[] spaceSplit = str.split(" "); // [Java, ile, hayat, daha, kolay]

        System.out.println(Arrays.toString(spaceSplit));
        System.out.println("Cumledeki kelime sayisi: " + spaceSplit.length); // Cumledeki kelime sayisi: 5

        System.out.println(Arrays.toString(str.split("e"))); // [Java il,  hayat daha kolay]
        System.out.println(Arrays.toString(str.split("")));
        // [J, a, v, a,  , i, l, e,  , h, a, y, a, t,  , d, a, h, a,  , k, o, l, a, y]

    }
}
