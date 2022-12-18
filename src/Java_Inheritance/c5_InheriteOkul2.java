package Java_Inheritance;

public class c5_InheriteOkul2 extends c4_InheriteOkul1 {
    protected int saatlikUcreti;
    protected String statu;
    protected int maas= 8;

    protected int maasHesapla(){
        int maas = saatlikUcreti*8*30;
        return maas;
    }
}
