package day12_MethodCreation;

public class c2_FaktoriyelHesap {
    public static void main(String[] args) {
        // verilen bir sayinin 15'den kucuk bir pozitif tamsayi oldugunu kontrol edin
        // kucukse bir method olusturup, faktoryel degerini yazdirin
        // sayi istenen aralikta degilse vyari yazdirin
        int input = 12;
        if (input > 0 && input < 15) {
            faktoryelYazdir(input);
        }
        else {
            System.out.println("Girilen sayi 15'den kucuk pozitif tamsayi olmalidir");
        }
    }

    public static void faktoryelYazdir(int sayi) {
        int faktoriyelSonucu = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoriyelSonucu *= i; // her Loop'ta gelen sayiyi onceki deger ile çarpalim
        }
        System.out.println("Girilen " + sayi+" icin faktoryel : " + faktoriyelSonucu);
    }
}