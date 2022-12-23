package Java_txtDosyaOkuma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class c1_txtOkuma {

    public static void main(String[] args) throws IOException {

        // Listede kac baslik ve
        // bu basliklar altinda kac urun oldugunu bulalim.

        String path = "src/Java_txtDosyaOkuma/urunler.txt";
        FileInputStream txtOku= new FileInputStream(path);
//        System.out.println(txtOku.read());
//        System.out.println((char)txtOku.read());  //a

        int control = 0;
        String metin = "";
        while((control = txtOku.read()) != -1){
            metin +=(char) control;
        }
        System.out.println(metin);


        ///////////////////

        int urunSayisi = 0;
        String arr[]=metin.split("-");
        System.out.println("Urun sayisi : " + (arr.length-1));


        ///////////////////
        int baslikSayisi =0;
        int index = 0;
        for (int i = 0; i < metin.length(); i++){

            char karakter = metin.charAt(i);
            if (i==0){
                if (Character.isDigit(karakter)){
                    baslikSayisi++;
                }
            }else {
                char oncekiKarakter = metin.charAt(i-1);
                if (Character.isDigit(karakter) && (!Character.isDigit(oncekiKarakter))){
                    baslikSayisi++;
                }
                   }


        }
        System.out.println("Baslik Sayisi : " + baslikSayisi);

    }
}
