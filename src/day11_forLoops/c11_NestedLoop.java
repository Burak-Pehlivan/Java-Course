package day11_forLoops;

public class c11_NestedLoop {
    public static void main(String[] args) {

        /* Şekli elde etme

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *

         */

        int input = 4 ;

        //Artis
        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        //Azalis   1.YOL
//        for (int i =1 ; i <=input-1 ; i++) {
//            for (int j = input ; j > i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Azalis   2.YOL
        for (int i = input-1; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
