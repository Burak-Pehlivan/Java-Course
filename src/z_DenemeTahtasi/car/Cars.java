package z_DenemeTahtasi.car;

public class Cars {
    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;


    public double go (int newDistance){
        distance += newDistance;
        double period = (double) newDistance/speed;
        return period;
    }

     public void accelarate(int yeniHiz){
        speed = yeniHiz;
     }

    public void stop(){
        speed = 0;
    }

    public String getInfo(){
        String info = "Car Info: " + year + " " + make + " " + ". Distance: " + distance;
        return info;
    }
}
