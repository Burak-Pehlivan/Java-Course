package day16_arrays;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class c11_sort {
    public static void main(String[] args) {
        // verilen bir Array'i Natural Order'a gore siralayip yazin.

        String[] isimler = {"selami","hakan","topal","Topal"};

        System.out.println(Arrays.toString(isimler)); // [selami, hakan, topal, Topal]

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); // [Topal, hakan, selami, topal]

        // eger buyukten kucuge siralamak istersek, once sort kullanarak natural ordera gore siralar.
        // sonra gecici bir array kullanarak siralamayi terse ceviriz.
    }
}
