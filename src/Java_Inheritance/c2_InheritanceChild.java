package Java_Inheritance;

public class c2_InheritanceChild extends c1_Inheritance {
    public static void main(String[] args) {
        System.out.println(sayi);
        sayi=20;
        System.out.println(sayi);
        method();

        c2_InheritanceChild obj = new c2_InheritanceChild();
        obj.str = "Burak";
        obj.method2("Java inheritance");

    }

}
