package Java_Polymorphism;

public class c1_toyotaSeller {
    public static void main(String[] args) {

        // overloading : ayni isim farkli signature ile ayni class'ta birden
        // fazla method olusturmaniza imkan tanir.

        c1_toyotaSeller obj1 = new c1_toyotaSeller();

        obj1.yakit(); //c1_toyotaSeller
        //obj1.yakit(2020);
        //obj1.yakit(2010,5.3);


        //overriding : parent class'ta var olan bir methodun
        // child classta olusturulan ayni isim ve signature'a sahip
        // bir method tarafindan gecersiz kilinmasidir.

        c1_Toyota obj2 = new c1_Toyota();
        obj2.yakit(); // Toyota

        c1_Toyota obj3 = new c1_toyotaBenzinli();
        obj3.yakit(); // c1_toyotaBenzinli

        c1_Toyota obj4 = new c1_toyotaDizel();
        obj4.yakit(); // c1_toyotaDizel

        c1_Toyota obj5 = new c1_toyotaElektrikli();
        obj5.yakit(); // c1_toyotaElektrikli
    }

    public void motor (){
        System.out.println("Musteri nasil motor isterse, bulunuz");
    }

    public void yakit(){
        System.out.println("Musteri hangi yatit isterse, bulunuz");
    }

    public void yakit(double maxTuketim){
        System.out.println("istediginiz " + maxTuketim + " lt tuketime uygun arac buluruz." );
    }

    public void yakit(int yil){
        System.out.println("istediginiz " + yil+ " yilina ait model buluruz");
    }

    public void yakit(int yil, double maxTuketim){
        System.out.println("istediginiz " +yil + " yila ait ortalama "+ maxTuketim+ " litre tuketimine sahip araclari buluruz.");
    }

}
