package day13_MethodOverloading_WhileLoop;

public class c2_MethodOverloading {
    public static void main(String[] args) {
        String str= "Java cok guzel";

        System.out.println(str.substring(5)); //cok guzel

        System.out.println(str.substring(3, 5));  // "a "

        //eger sectigimiz isimde birden fazla method varsa buna overloading denir.
        //ve aynı isimdeki method'lardan hangisinin calisacagina argument/parametre uyumu karar verir.

        toplama(1,2);
        toplama(1,2,3);

        toplama(5,6);  // iki tamsayinin toplami: 12
        toplama(4.5,5); //  double ve int toplami: 9.5
        toplama(5.5,7.5); // double ve double toplami: 13.0
    }

    public static void toplama(int sayi1, int sayi2){
        System.out.println("iki tamsayinin toplami: "+ (sayi1+sayi2));

    }

    public static void toplama(int sayi1, int sayi2, int sayi3){
        System.out.println("uc sayinin toplami: " + (sayi1+sayi2+sayi3));

    }

    public static void toplama(double sayi1,int sayi2){
        System.out.println("double ve int toplami: "+ (sayi1+sayi2));

    }

    public static void toplama(int sayi2,double sayi1){
        System.out.println("int ve double toplami: " + (sayi2+sayi1));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("double ve double toplami: "+ (sayi1+sayi2));
    }
}
