package day08_StringManipulation.sorular;

public class q1_sorular {
    public static void main(String[] args) {

        //  Soru 1: Kullanicidan bir cumle alin
        //      - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //      - cumlede is geciyorsa, "calismak guzeldir"
        //      - ikisini de iceriyorsa "Hem ev lazim hem is"
        //      - hicbirini icermiyorsa "cok calisman lazim" yazdirin

        String str ="Evden calisiyorum, ise gitmeye gerek yok";
        String calisilacakStr = str.toLowerCase();

        if(calisilacakStr.contains("ev") && calisilacakStr.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if(calisilacakStr.contains("ev")){
            System.out.println("home home sweet home");
        } else if(calisilacakStr.contains("is")){
            System.out.println("calismak guzeldir");
        } else{
            System.out.println("cok calisman lazim");
        }

        //Soru 2: Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //              input1: "15.30 €", input2 : "11.40 €"
        //              output: 36.70 €

        String input1 = "15.30 €";
        String input2 = "11.40 €";
        input1 = input1.replace(" €","");
        input2 = input2.replace(" €","");
        double input12 =Double.parseDouble(input1);
        double input21 =Double.parseDouble(input2);
        double input3 = input12+input21;

        System.out.println(input3);

        // Soru 3: Kullanicidan alinan metindeki istenmeyen rakam ve ozel arakterleri silip,
        //         sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //              input: java1 ogRe2@nMek3 #ne +Gu=zel
        //              output : Java ogrenmek ne guzel.

        String str1 = "java1 ogRe2@nMek3 #ne +Gu=zel";
        str1 = str1.replace(" ","5");
        str1 = str1.replaceAll("\\W","")
                 .replace("5"," ")
                 .replaceAll("\\d","")
                 .toLowerCase().replace("j","J");
        System.out.println(str1);

    }
}
