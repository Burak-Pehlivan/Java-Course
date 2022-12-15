package day08_StringManipulation;

public class c3_ReplaceAll {
    public static void main(String[] args){

        //Bu metindeki sayılardan kurtulun.
        String str = "ja1va 56Guz,zel-dir";


        System.out.println(str.replace("1","")
                                .replace("5","")
                                .replace("6",""));

            /*
                    Regex (Regular Expressions)
            \\s: space
            \\S: space olmayan hersey
            \\s+: yanyana birden fazla space
            \\d: digits
            \\D: digit olmayan hersey
            \\w: harf veya rakam
            \\W: harf veya rakam olmayan hersey


             */
        //str = "Ja1va4 56G7uz,z9el-d0ir8";
        str = "Ja7va,; og436ren,./dikce guzelle=-098siyor";
        str = str.replaceAll("\\d","");   // sayıları kaldırma
        System.out.println(str);

        str = str.replace(" ","5");

        str=str.replaceAll("\\W", "");

        System.out.println(str);  //

        str = str.replace("5"," ");

        System.out.println(str);


        /* Harf sayisi bulma */
        String harfSayisi = "Ali Can, Burak, Buket, Tuna";
        harfSayisi= harfSayisi.replaceAll("\\W","");
        System.out.println(harfSayisi.length());

    }
}
