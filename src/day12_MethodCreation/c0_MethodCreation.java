package day12_MethodCreation;

public class c0_MethodCreation {


   /* access modifier: method'a proje icerisinden nerelerden ulasilabilecegini belirler.
    public: Proje icerisinde tum class'lardan kullanilabilir.
    protected: Sadece icinde bulundugu package ve child class'lardan kullanilir
    default: Sadece icinde bulundugu paket(package)'den kullanilir
    private: Sadece bulundugu class'da kullanilabilir

    */

    public static void main(String[] args) {

        String str ="Java Guzeldir";

        System.out.println(str);

        str = str.toUpperCase();

        System.out.println(str);

    }


}
