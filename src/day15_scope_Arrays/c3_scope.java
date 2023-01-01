package day15_scope_Arrays;

public class c3_scope {
    static int sayi = 5;
    String ders = "Java";

    public static void main(String[] args) {
        sayi=100;
       // ders = "Java course";   // static olmayan variable static main icinden ulasilamaz.

        int mainSayi = 152;  // sadece olusturuldugu method icinde ulasilabilir. baska methodlar ulasamaz.

    }

    public static void staticMethod(){
        sayi =100;
      //   System.out.println(ders); // static olmayan variable static method icinden ulasilamaz.
       // mainSayi=10;   // main methodu icinde oldugu icin baska method icinde kullanilamaz.
    }

    public void staticOlmayanMethod(){
        System.out.println(sayi);
        ders = "Java Course 5";  //static olmadigi icin static olmayan methodtan ulasilabilir.
    }

}
