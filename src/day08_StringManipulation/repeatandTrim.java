package day08_StringManipulation;

public class repeatandTrim {
    public static void main(String[] args) {

        String str = "Java Candir.";
        System.out.println(str.repeat(4));

        String str1 = "     JAVA candir.  ";
        System.out.println(str1);
        System.out.println(str1.trim());   // Baş ve sondaki boşlukları silme.
    }
}
