package day14_methodOlusturma;

public class c3_stringTerseCevirme {
    public static void main(String[] args) {
        // parametre olarak bir string kabul edip
        // stringin terse çevrilmiş halini döndüren method oluşturun

        String tersYuz = "Tersini Yuzune CeviR";
        System.out.println(stringTersi(tersYuz));


    }

    public static String stringTersi(String i){

        String tersStr= "";

        for (int j = i.length()-1; j >= 0; j--) {
            tersStr+=i.charAt(j);
        }
        return tersStr;
    }
}
