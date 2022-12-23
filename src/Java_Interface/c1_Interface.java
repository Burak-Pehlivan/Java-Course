package Java_Interface;

public interface c1_Interface {
    public static final int SAYI1= 20;    // public, static ve finallari yazmaya gerek yoktur. Kendisi zaten oyle kabul ediyor.
    static final int SAYI2=10;
    final int SAYI3=5;
    int SAYI4= 3;


    void inter1a();
    abstract void inter1b();


    // Interface'i implement eden tum classlarda override etme zorunlulugundan kurtulmak icin default ve static kullanilir.
    default void inter1c(){

    }

    static void inter1d(){

    }
}
