package day14_methodOlusturma;

import java.util.Scanner;

public class c7_soruAsalSayi {
    public static void main(String[] args) {
        // Kullanicidan main method içinde pozitif tamsayı alın.
        // Girilen sayinin asal sayi kontrolünü yap
        // sonuçta "asal sayi" veya "asal sayi degil" yazdiran method oluşturun

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir pozitif tam sayi yazin:");
        int tamsayi = sc.nextInt();

        System.out.println(asalSayiKontrol(tamsayi));     //
        System.out.println(asalSayiKontrol(23));  // asal

    }

    public static String asalSayiKontrol(int tamsayi){
        String sonuc = "";

        for (int i = 2; i < tamsayi ; i++) {
            if(tamsayi%i==0){
                sonuc="Asal degildir.";
                break;
            }
            /*else {
            sonuc="Asaldir.";
            }*/
        }
        if(!sonuc.equals("Asal degildir.")){
            sonuc="asal";
        }

        return sonuc;
    }

}
