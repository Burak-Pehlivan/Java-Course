package day16_arrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class c10_Soru {
    public static void main(String[] args) {
        // Kullanicidan yeni isimler alip var olan bir array'e ekleyen method olustur.
        // Kullanici yeni deger verdigi muddetce C10'daki hazir method'u kullanarak eklemeye devam edin
        // Kullanici Q'ya bastiginda, array'in son halini döndürün.

        ArrayeIsimYazma();

        }
    public static void ArrayeIsimYazma(){
        Scanner sc = new Scanner(System.in);
        String isim;
        String[] arr = new String[0];
        boolean bool = true;

        while(bool){
        System.out.print("eklenecek ismi yaziniz: ");
        isim = sc.nextLine();

        if(isim.equals("q") || isim.equals("Q")){
            bool = false;
        }else {
            arr = c9_ArrayeYeniElementEkleme.arrayeElementEkleme(arr,isim);
        }
        }
        System.out.println(Arrays.toString(arr));
        }
}

