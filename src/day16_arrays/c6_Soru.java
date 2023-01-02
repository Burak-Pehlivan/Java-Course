package day16_arrays;

public class c6_Soru {
    public static void main(String[] args) {

        //Verilen arraydeki en yuksek ve en dusuk sayilari bulun.

        int[] arr= {1,2,3,4,5,6,7,8,9,11,-25};
        enBuyukSayi(arr);
    }

    public static void enBuyukSayi(int[] sayilar){
        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];

        for (int i = 1; i < sayilar.length ; i++) {
            if (enBuyuk < sayilar[i]){
                enBuyuk=sayilar[i];
            }
        }

        for (int i = 1; i < sayilar.length ; i++) {
            if(enKucuk>sayilar[i]){
                enKucuk=sayilar[i];
            }
        }
        System.out.println("en buyuk sayi: " + enBuyuk);
        System.out.println("en kucuk sayi: " + enKucuk);
    }
}
