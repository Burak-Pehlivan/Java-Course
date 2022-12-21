package Java_Polymorphism;

public class c1_toyotaBenzinli extends c1_Toyota {

    public void motor() {
        System.out.println("Toyota benzinli araclar 1.4 cevreci");
    }


    public void yakit() {
        System.out.println("Toyota Benzinli araclar E10 benzini kullanir");
    }


    public void yakit(Double maxTuketim) {
        System.out.println("Toyota benzinli araclar ortalama 6.8 lt benzin kullanir.");
        if (maxTuketim < 6.8) {
            System.out.println("benzinli bir toyota alabilirsiniz.");
        } else {
            System.out.println("Isteginize uygun bir benzinli toyota bulamazsiniz.");
        }
    }

}
