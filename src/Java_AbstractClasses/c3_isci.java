package Java_AbstractClasses;

public class c3_isci extends c2_muhasebe{

    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "c3_isci{" +
                "sirket ismi" + sirketIsmi +
                ", aylikCalismaSuresi=" + aylikCalismaSuresi +
                ", maas=" + maas +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        c3_isci isci1= new c3_isci();
        isci1.saatUcreti=isci1.saatUcreti();
        isci1.aylikCalismaSuresi= isci1.aylikCalismaSuresi();
        isci1.maas=isci1.maas(isci1.saatUcreti, isci1.aylikCalismaSuresi);
        isci1.isim="Hasan";
        isci1.soyisim="Can";

        System.out.println(isci1);
    }
}
