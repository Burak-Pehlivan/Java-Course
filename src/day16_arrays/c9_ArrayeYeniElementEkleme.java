package day16_arrays;

import java.util.Arrays;

public class c9_ArrayeYeniElementEkleme {
    //Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
    // eski array’e yeni degeri atayin.
    public static void main(String[] args) {
        String[] name = {"ali","burak","unal"};
        String eklenecekIsim = "tuna";

        name = arrayeElementEkleme(name,eklenecekIsim);

        System.out.println(Arrays.toString(name));  // [ali, burak, unal, tuna]
    }

    public static String[] arrayeElementEkleme(String[] eklenilecekArray, String eklenecekElement){
        String[] temp = new String[eklenilecekArray.length+1];

        for (int i = 0; i < eklenilecekArray.length; i++) {
            temp[i]=eklenilecekArray[i];
        }

        temp[temp.length-1] = eklenecekElement;

        return temp;
    }

}
