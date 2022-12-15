package day13_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class c5_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // " Bu kadar sayi yeter " diyip toplami yazdirsin.


        Scanner sc = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;


        // For loop ile

        for (int i=1;i<10000;i++){
            System.out.print("Toplamak uzere tamsayi girin: ");
            sayi = sc.nextInt();

            toplam+=sayi;

            if(toplam>=500){
                System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu.");
                break;
            }
        }


        //While loop ile

        toplam = 0;
        sayi = 0;

        while(toplam<500){
            System.out.print("toplamak uzere tamsayi giriniz: ");
            sayi = sc.nextInt();

            toplam+=sayi;
        }
        System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu.");




        //Soru 4 : Kullonicidon bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
// eger tum sartlari saglarso, "sifre basariylo kaydedildi" yazdirin
// - ilk harf kucuk harf olmali
// - son karakter rakam olmali
// -sifre bosluk icermemeli
// - uzunlugu en az 10 karakter olmoli

    }
}
