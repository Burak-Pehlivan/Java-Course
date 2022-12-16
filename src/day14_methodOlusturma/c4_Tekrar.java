package day14_methodOlusturma;

public class c4_Tekrar {
    public static void main(String[] args) {

        int a = 10, c=30;
        int b = 20;

        //bu iki sayinin carpim sonucunu yeni kod yazmadan konsola yazdirin.
        System.out.println(c1_carpim.carpim(a, b));



        String x = "Nasil";
        String y = "yani";

        //bu iki stringi arada boşluk bırakarak yazın.
        System.out.println(c2_stringConcate.stringConcateOlusturma(x, y));



        String e = "bu da mi gol degil";

        //Stringi tersten yazdir.
        System.out.println(c3_stringTerseCevirme.stringTersi(e));

    }
}
