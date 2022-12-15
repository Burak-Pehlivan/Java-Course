package day13_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class c6_SifreKontrolu {
    public static void main(String[] args) {

        //Soru 4 : Kullonicidon bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarso, "sifre basariylo kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // -sifre bosluk icermemeli
         // - uzunlugu en az 10 karakter olmoli


        // sifre kontrolunu bir methodta yapıp true/false dondurun
        // main method'da donen sonuc kontrol edip
        // "basari ile olusturuldu" yazincaya kadar sifreyi tekrar tekrar isteyin.


        Scanner sc = new Scanner(System.in);
        boolean tekrarSifreIste = true;
        String sifre = "";

        while (tekrarSifreIste){

            System.out.println("Lutfen sifrenizi giriniz: ");
            sifre = sc.nextLine();

            if(sifreKontrolEt(sifre)){ // sifre kontrolü true donerse sifre basarili demektir.
            System.out.println("sifre basariyla olusturuldu.");
           // break;
            tekrarSifreIste =false;   // break yada bu yazılabilir.
            }

        }


    }
    public static boolean sifreKontrolEt(String sifre){

        int flag=0;

        //- ilk harf kucuk harf olmali
        if(!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){  // (sifre.charAt(0)<'a' && sifre.charAt(0)>'z')
            System.out.println("ilk harf kucuk olmali");
            flag++;
        }

        //- son karakter rakam olmali
        if(!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }

        //- sifre bosluk icermemeli
        if(sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }

        //- uzunlugu en az 10 karakter olmali
        if(!(sifre.length()>=10)){
            System.out.println("uzunluk en az 10 karakter olmali");
            flag++;
        }

        if(flag==0){
            return true;
        }else {
            return false;
        }

    }
}
