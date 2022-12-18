package Java_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class c2_ArrayListYazdirma {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []


        isimler.add("Burak");
        isimler.add("Pehlivan");

        System.out.println(isimler); // [Burak, Pehlivan]

        // tek tek eklemek zorundayiz.

    }
}
