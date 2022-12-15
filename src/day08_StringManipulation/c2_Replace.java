package day08_StringManipulation;

public class c2_Replace {

    public static void main(String[] args) {
        String str = "Java ogren, adana ye :)";

        System.out.println(str.replace('a', 'A')); // JAVA ogren, AdAnA ye :)

        System.out.println(str.replace("", "")); // Javaogren, adanaye :)

        System.out.println(str.replace("Java", "Yazilim")); // Yazilim ogren, adana ye :)


        String telefon = "555 3451234";

        System.out.println(telefon.replace("555", "532")); // 532 3451234
        System.out.println(telefon.replace('3', '7'));



        // asagidaki arama sonucunun 10 binden fazla oldugunu test edin
        String sonuc= "1-16 of over 100,000 results for \"apple\"";
        int indexOver=sonuc.indexOf("over");
        System.out.println(indexOver);
        int indexResults= sonuc.indexOf("results");
        System.out.println(indexResults);
        String sonucSayisiStr= sonuc.substring(indexOver+5, indexResults-1);
        System.out.println(sonucSayisiStr); // 100,000

        String snc = sonucSayisiStr.replace(",","");
        System.out.println(snc);

        int sonucSayisiInteger= Integer.parseInt(sonucSayisiStr); // String 100000  Integer 100000'e çevirir.



    }
}
