package Java_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class c5_ArrayiArrayListYapma {
    public static void main(String[] args) {

        int[] arr = {2,3,61,21,52,56,2,12,5,677};

        List<Integer> sayilar = new ArrayList<>();
        for (Integer each: arr
             ) {
            sayilar.add(each);
        }

    }
}
