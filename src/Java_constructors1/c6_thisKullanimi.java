package Java_constructors1;

public class c6_thisKullanimi {

    // basina konuldugu variable'in instance variable oldugunu belirtmek icin kullanilir.
    String isim;
    String soyisim;
    String brans;
    public c6_thisKullanimi(String isim, String soyisim, String brans){

        this.isim = isim;
        this.soyisim = soyisim;
        this.brans = brans;

        //eger this kullanilmasaydi constructorin parametre icindeki isim'i algilayacakti.
        // this kullanarak instance variable'lar oldugunu belirterek constructor'in sorunsuz calismasini saglar.
    }

}
