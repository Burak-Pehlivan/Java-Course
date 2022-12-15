package day08_StringManipulation.sorular;

public class q2_sorular {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali

            String sifre = "abc1453";

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

        System.out.println(flag);

            if(flag==0){
                System.out.println("sifreniz basarili kaydedildi");
            }




        //Soru 5 Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.



        //Soru 6: Kullanicidan alinan bir String alin, String'in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin.

    }
}
