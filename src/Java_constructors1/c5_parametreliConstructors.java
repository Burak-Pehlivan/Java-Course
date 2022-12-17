package Java_constructors1;

public class c5_parametreliConstructors {
    String isim;
    String soyisim;
    String brans;

    public c5_parametreliConstructors(String ism, String soyism, String brns){

        isim = ism;
        soyisim = soyism;
        brans = brns;

    }

    public static void main(String[] args) {
        c5_parametreliConstructors ogr1 = new c5_parametreliConstructors("Alis","kalismera","haybe");

        System.out.println(ogr1.isim);
        System.out.println(ogr1.soyisim);
        System.out.println(ogr1.brans);
    }
}
