package day14_methodOlusturma;

public class c5_substringOlustur {
    public static void main(String[] args) {

        /*
        Soru 1: Kullanicidan input olarak verilen bir string,
        baslangic ve bitis indexlerine göre baslangic index'i dahil, bitis index'i haric olacak sekilde
        aradaki harfleri yazdiran method olusturun.

        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin.
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.

         */

        String input = "Java ne kadar guzel";
        int baslagicIndex = 5;
        int bitisIndex = 7;

    }


    public static void substringMethodu(String i, int basIndex, int bitisIndex){

        if(basIndex>bitisIndex){
            System.out.println("Baslangic indexi bitis indexinden buyuk olamaz.");
        } else if(bitisIndex >= i.length()){
            System.out.println("Bitis indexi String'in sinirlari disinda");
        } else {
            for (int j = basIndex; j <bitisIndex ; j++) {
                System.out.println(i.charAt(j));
            }

            System.out.println("");
        }
    }
}


