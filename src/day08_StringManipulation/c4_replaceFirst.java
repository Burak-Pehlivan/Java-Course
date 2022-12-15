package day08_StringManipulation;

public class c4_replaceFirst {
    public static void main(String[] args) {

        String str = "Java heyecandir.";

        //tüm a'ları değil de sadece ilk a'yı değiştirmek istersek

        System.out.println(str.replaceFirst("a", "A"));

        // ilk harf veya rakamı * yap

        System.out.println(str.replaceFirst("\\w", "*"));

    }
}
