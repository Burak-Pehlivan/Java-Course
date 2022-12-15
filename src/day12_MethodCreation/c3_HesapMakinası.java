package day12_MethodCreation;

import java.util.Scanner;

public class c3_HesapMakinası {
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("Lutfen bir islem secin +, -, /, *");
        char islem = scan.next().charAt(0);

        System.out.println(hesapMakinasi(sayi1,sayi2,islem));
    }

    public static double hesapMakinasi(double sayi1, double sayi2, char islem) {
        switch (islem) {
            case '+':
                return sayi1 + sayi2;


            case '-':
                return sayi1 - sayi2;


            case '/':
                return sayi1 / sayi2;


            case '*':
                return sayi1 * sayi2;


            default:
                return 0;
        }
    }
}
