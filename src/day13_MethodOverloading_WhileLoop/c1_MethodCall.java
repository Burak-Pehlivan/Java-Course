package day13_MethodOverloading_WhileLoop;

import day12_MethodCreation.c1_AsalSayiMi;
import day12_MethodCreation.c5_MetinTersCevir;
import day12_MethodCreation.c7_fibonacciSerisi;

public class c1_MethodCall {
    public static void main(String[] args) {

        c7_fibonacciSerisi.fibonacciYazdir(15);   // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        //asagida verilen cümleyi tersten yazdir

        String str = "Bir kere yaparim, yan gelir yatarim";

        String tersStr = c5_MetinTersCevir.metniTersCevir(str);
        System.out.println(tersStr);   // miratay rileg nay ,mirapay erek riB

        // asagida verilen cumlenin palindrom olup olmadigini kontrol et

        String str1="Java Candir.";
        String tersStr1 =  c5_MetinTersCevir.metniTersCevir(str1);
        System.out.println(tersStr1);

        if(str1.equals(tersStr1)){
            System.out.println(str1 + " Palindrome'dur.");
        }else {
            System.out.println(str1 + " Palindrome degildir.");
        };

        //asagida verilen sayinin asal olup olmadigi kontrol et

        int sayi = 20;
        boolean sonuc = c1_AsalSayiMi.asalSayiMi(sayi);

        if(sonuc){
            System.out.println("Girilen sayi asaldir: "+ sayi);
        }else {
            System.out.println("Girilen sayi asal degildir: " +sayi);
        }


    }
}
