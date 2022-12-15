package day13_MethodOverloading_WhileLoop;

public class c4_WhileLoop {
    public static void main(String[] args) {

        //2 basamakli sayilardan 7 ile bolunebilen sayilari yazin

        for(int i = 10; i<100; i++){
            if(i%7==0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        // ayni soruyu while loop ile

        int sayi = 10;
        while (sayi <100){
            if (sayi%7==0){
                System.out.print(sayi + ", ");

            }
            sayi++;
        }

        // for loop ile yapılabilecek bir soruyu while loop ile yapmak zahmetli!!
    }
}
