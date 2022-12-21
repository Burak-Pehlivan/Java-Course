package Java_Polymorphism;

import javax.swing.*;

public class c1_toyotaDizel extends c1_Toyota {

    public void motor() {
        System.out.println("Toyota dizel araclar 1.6 dizel motora sahiptir");
    }


    public void yakit() {
        System.out.println("Toyota Dizel araclar EuroDizel yakit kullanir.");
    }


    public void yakit(String renk) {
        System.out.println("Toyota dizel araclar 3 renkte uretilmistir.");
        if (renk.equalsIgnoreCase("Beyaz") ||
                renk.equalsIgnoreCase("siyah") ||
                renk.equalsIgnoreCase("mavi")) {
            System.out.println("istediginiz renkte dizel Toyota bulunmaktadir.");
        } else {
            System.out.println("istediginiz renkte dizel Toyota bulunmamaktadir.");
        }

    }
}
