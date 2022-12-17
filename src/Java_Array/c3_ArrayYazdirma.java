package Java_Array;

import java.util.Arrays;

public class c3_ArrayYazdirma {
    public static void main(String[] args) {

        //Array non-primitive data(obje)dir ve direk yazdirilamaz.
        //Ancak Java'nin olusturdugu Arrays class'indan yardim alinarak yazdirilabilir.

        int sayi3[] = {5, 6, 12, 25};

        System.out.println(sayi3); //  [I@58372a00

        System.out.println(Arrays.toString(sayi3));   // [5, 6, 12, 25]
        System.out.println(sayi3[2]); //2.indexi yazdirmaya calisirsak  12  yazdirir.

    }


}
