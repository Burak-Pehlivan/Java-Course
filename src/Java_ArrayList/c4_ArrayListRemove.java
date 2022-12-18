package Java_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class c4_ArrayListRemove {
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

        List<String> isimler3 = new ArrayList<>();
        isimler3.add("Tuna");
        isimler3.add("Pehlivan");

        isimler.removeAll(isimler3); // Case sensitive
        System.out.println(isimler); // [Burak, Buket]

    }
}
