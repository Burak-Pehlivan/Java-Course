package day08_StringManipulation;

public class c1_NullPointer {
    public static void main(String[] args){

        String str1= "";
        String str2= "    ";
        String str3;
        String str4= null;
        System.out.println(str1.length()); // @
        System.out.println (str2.length()); // 4
        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false
        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true
            // null bir deger degil isaretcidir (null pointer)
            // null pointer : non primitive bir objenin olusturuldugunu
            //                ancak bilincli olarak deger atanmadigini isaretler
            //                str4'un degeri null'dir cumlesi YANLIS,
            //                str4 null olarak isaretlenmistir cumlesi DOGRU

            // System.out.println(str3.Length());
            // System.out.println(str3.concat("Ali Can"));
            // System.out.println(str3.substring(3, 4));
        String s="hello";
        System.out.println(s.substring(2));   // llo
        System.out.println(s.substring(2,3));   // h,   (1,3) -> el,    (2,3) ->l,   (4,5) -> o

    }

}
