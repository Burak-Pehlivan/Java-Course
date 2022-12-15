package day13_MethodOverloading_WhileLoop;

public class c3_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4,6.3); // double ve double toplami: 11.7

        toplama('a','b');  //'a' = 97  ve 'b' = 98   -> int ve double toplami: 195.0


            //ilk olarak %100 uyumlu parametreler arar.
            //eger %100 uyumlu yoksa calisabilecek method var mi kontrol eder
            //calisacak method birden fazla olursa minimum casting yaparak kullanılacak olanı tercih eder.

        toplama(8.4,5); // double ve double toplami: 13.4

    }



    public static void toplama(int sayi2,double sayi1){
        System.out.println("int ve double toplami: " + (sayi2+sayi1));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("double ve double toplami: "+ (sayi1+sayi2));
    }
}
