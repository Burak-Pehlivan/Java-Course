package Java_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class c3_ArrayListBirlestirme {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Burak");
        isimler.add("Pehlivan");
        System.out.println(isimler); // [Burak, Pehlivan]

        // tek tek eklemek zorundayiz.

        // ArrayList birlestirme
        List<String> isimler2 = new ArrayList<>();
        isimler2.add("Tuna");
        isimler2.add("Buket");
        System.out.println(isimler2); //   [Tuna, Buket]

        isimler.addAll(isimler2);
        System.out.println(isimler); //    [Burak, Pehlivan, Tuna, Buket]

    }
}
