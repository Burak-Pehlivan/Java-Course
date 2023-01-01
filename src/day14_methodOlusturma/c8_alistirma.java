package day14_methodOlusturma;

import java.util.Locale;

public class c8_alistirma {
    public static void main(String[] args) {


        guncelle("John", "Black");

    }
    public static void guncelle(String s, String t){
        s = s.substring(0,1).toUpperCase() + t.substring(2);
        System.out.println(s);
    }
}
