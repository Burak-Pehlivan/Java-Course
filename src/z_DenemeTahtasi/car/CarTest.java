package z_DenemeTahtasi.car;

public class CarTest {
    public static void main(String[] args) {

        Cars car1 = new Cars();
        Cars car2 = new Cars();

        car1.speed = 90;
        car1.distance = 250;
        car1.make= "Opel";
        car1.year= "2019";
        car1.model= "Corsa";

        car2.speed = 70;
        car1.accelarate(90);
        car2.accelarate(75);


    }


}
