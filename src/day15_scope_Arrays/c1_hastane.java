package day15_scope_Arrays;

public class c1_hastane {

    static String hastaneismi="Yildiz Hastanesi";
    static String hastaneAdres= "Cankaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        /*
        Eger tum methodlardan kullanilabilecek variable'lar olusturmak isterseniz
        bu variable'larii class level'da olustururuz.

        Class level'da olusturulacak variable'lar icin 2 ihtimal vardir.
        1- static variable (Class variable)
        2- instance(static olmayan) variable (obje variable)

        Kural 1- Static variable'lar tum objeler icin tek bir deger alir.
                 instance variable'lar her obje icin Java tarafindan cogaltilir.

        Kurak 2- class level variable'lara deger atamasak da kullanabiliriz.
                 biz deger atamasak bile java class level variable'lara default degerler atar
                 non - primitive ==> null (String icin)
                 sayisal primitiveler icin ==> 0
                 char icin    ==> hiclik ''
                 boolean icin ==> false

         Kural 3- static olan methodlardan static olmayan variable ve methodlara direk ulasilamaz.
                  instance variable ve static olmayan methodlari static alanlardan kullanmak isterseniz
                  obje uzerinden kullanabilirsiniz.

         Kural 4- closs'do olusturulon instance variable'lor ilk deger atamasini yopor
                  yani bir obje itk olusturuldugunda otomotik olarak instance voriable'a atanan degeri alir.
                  deger atanmamissa typeina gore default degerler alir.
                  obje olusturulduktan sonra obje uzerinden yapilan atamalar
                  class leveldaki instance variablela degil. Java tarafindan olusturulup
                  objeye yapistiril;lan kopya variable'a yapilir.

         */


        c1_hastane per1 = new c1_hastane();
        System.out.println(per1.personelAdresi);   //null
        System.out.println(per1.personelIsmi);     //null
        System.out.println(per1.personelTel);      //null

        per1.personelIsmi="Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel="+49267746723";

        c1_hastane per2= new c1_hastane();
        System.out.println(per2.personelIsmi); //null

        per1.personelIsmi="Yusuf";
        System.out.println(per2.personelIsmi); //null
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi); // Ayten
        System.out.println(per1.personelIsmi); // Yusuf


    }

    public static void method1(){
        System.out.println(hastaneAdres);
    }

    public static void method2(){
        System.out.println(hastaneismi);
    }

 }

