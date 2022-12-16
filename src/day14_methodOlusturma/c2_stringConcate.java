package day14_methodOlusturma;

public class c2_stringConcate {
    public static void main(String[] args) {
        //verilen 2 stringi parametre olarak kabul edip
        // bu iki string'i aralarında bir bosluk olan tek bir String olarak main method'a döndüren bir method oluşturun.

        String str = "Java 1 kisiliktir.";
        String str2 = "Gercekler KV";

        System.out.println(stringConcateOlusturma(str, str2));


    }

    public static String stringConcateOlusturma (String i, String j){
        System.out.println("String methodu calisti");
        return i+" "+j;
    }
}
