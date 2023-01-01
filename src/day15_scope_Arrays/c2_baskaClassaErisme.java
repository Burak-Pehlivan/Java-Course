package day15_scope_Arrays;

public class c2_baskaClassaErisme {
    /*
    Baska classlardaki class uyelerine (variable/method) ulasmak icin static keyword onemlidir.

    Static olarak isaretlenen class uyelerine
    classIsmi.staticuyeIsmi seklinde ulasabiliriz.

    Static olmayan class uyelerine erisebilmek icin obje olusturmak gerekir.

    Java runtime programdir.
    basinca calisir. Calistigi surece yapilan islemleri KALICI olarak tutar.
    calisma bittiginde HER SEY YOK OLUR.

     */
    public static void main(String[] args) {

        System.out.println(c1_hastane.hastaneAdres); // Cankaya/Ankara
        c1_hastane.method1(); // Cankaya/Ankara

        System.out.println(c1_hastane.hastaneismi);  // Yildiz Hastanesi
        c1_hastane.method2(); // Yildiz Hastanesi

        c1_hastane has1 = new c1_hastane();
        System.out.println(has1.personelIsmi); //null    personelIsmi,personelTel ve personelAdresi'ne ulasabilmek icin
        System.out.println(has1.personelTel);  //null    has1 adinda obje olusturarak ulasabildik.
        System.out.println(has1.personelAdresi); //null

        has1.personelIsmi = "Burak";
        has1.personelAdresi = "Atalar";
        has1.personelTel = "+905391029452";
        has1.hastaneAdres = "uskudar";

        System.out.println(has1.personelIsmi);   //Burak
        System.out.println(has1.personelAdresi); //Atalar
        System.out.println(has1.personelTel);    //+905391029452
        System.out.println(has1.hastaneismi);    //Yildiz Hastanesi
        System.out.println(has1.hastaneAdres);   //uskudar

    }
}
