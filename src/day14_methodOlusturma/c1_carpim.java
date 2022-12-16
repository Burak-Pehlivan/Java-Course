package day14_methodOlusturma;

import java.util.Scanner;

public class c1_carpim {

    public static void main(String[] args) {

        // main method içinde kullanıcıdan iki sayı alın

        // bu iki sayıyı parametre olarak kabul edip, çarpımlarını bize döndüren bir method olsun.

        Scanner sc = new Scanner(System.in);
        System.out.print("Çarpılacak ilk sayıyı girin: ");
        double sayi1 = sc.nextDouble();
        System.out.print("Çarpılacak 2. sayıyı girin: ");
        double sayi2 = sc.nextDouble();

        carpim(sayi1,sayi2);

    }

    public static double carpim(double sayi1, double sayi2){
        System.out.println("carpim method'u calisti.");
        return sayi1*sayi2;
    }


}
