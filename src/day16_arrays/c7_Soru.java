package day16_arrays;

public class c7_Soru {
    // Verilen bir array'de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method

    public static void main(String[] args) {

        int[] arr = {2,3,4,2,6,2,7,8,1,5,2,1,2,9};
        int arananSayi = 2;

        elemanSayma(arr,arananSayi); // aranan sayi: 2, 5 kere kullanilmistir.
        elemanSayma(arr,8); // aranan sayi: 8, 1 kere kullanilmistir.

    }

    public static void elemanSayma(int[] arr, int arananSayi) {
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arananSayi) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("istediginiz eleman array'de hic yoktur. ");
        } else {
            System.out.println("aranan sayi: " + arananSayi+ ", " + sayac + " kere kullanilmistir.");
        }

    }
}
