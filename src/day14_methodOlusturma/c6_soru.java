package day14_methodOlusturma;

import java.util.Scanner;

public class c6_soru {
    public static void main(String[] args) {
        // Soru 2- Kullanıcıdan main method icinde
        // ayrı ayrı isim ve soyismini alin.
        // Isim ve soyismi ilk harfleri büyük diğer harfler küçük olacak
        // isim boşluk soyisim şeklinde döndüren method
        // input: isim : Ali soyisim: YILMAZ  output: Ali Yilmaz

        Scanner sc = new Scanner(System.in);
        System.out.println("İsmi yazınız:");
        String isim = sc.nextLine();
        System.out.println("Soyisim yazınız:");
        String soyisim = sc.nextLine();


        System.out.println(isimYazdirma(isim, soyisim));

        System.out.println(isimYazdirma("HaciSA","SoYDAn"));
    }

    public static String isimYazdirma(String isim, String soyisim){
        String yeniIsimSoyisim = isim.substring(0,1).toUpperCase()+
                                 isim.substring(1).toLowerCase()+
                                 " " +
                                 soyisim.substring(0,1).toUpperCase()+
                                 soyisim.substring(1).toLowerCase();

        return yeniIsimSoyisim;
    }
}
