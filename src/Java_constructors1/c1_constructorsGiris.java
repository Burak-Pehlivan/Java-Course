package Java_constructors1;

import java.util.Scanner;

public class c1_constructorsGiris {

    String isim = "isim belirtilmedi.";
    String soyisim = "Soyisim belirtilmedi.";
    String brans = "brans belirtilmedi.";

    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
            c1_constructorsGiris          ogretmen =            new             c1_constructorsGiris();
        //  obje olusturulan class   Objenin adi        new Keyword              constructor
        Scanner sc2 = new Scanner(System.in);

        c1_constructorsGiris sc1 = new c1_constructorsGiris();
        System.out.println(sc1.isim);
        System.out.println(sc1.soyisim);
        System.out.println(sc1.brans);
    }
}
