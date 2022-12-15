package day12_MethodCreation;

import java.util.Scanner;

public class c1_AsalSayiMi {
    public static void main(String[] args) {
        // verilen bir sayinin asal olup olmadigini true / false olarak
        // bir method olusturun
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int input1 = sc.nextInt();

        System.out.println(input1 + " asal midir? " + asalSayiMi(input1));

    }

    public static boolean asalSayiMi(int input) {
        boolean asalSayiMi=true;
        for (int i = 2; i <input; i++) {
            if (input%i == 0){ // eger burasi calisirsa asal sayi degil
                asalSayiMi=false;
                break;
            }
        }
        return asalSayiMi;
    }
}
