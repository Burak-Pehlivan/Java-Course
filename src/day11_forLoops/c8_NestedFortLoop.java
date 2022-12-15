package day11_forLoops;

public class c8_NestedFortLoop {
    public static void main(String[] args) {

        //Verilen input'a göre carpim tablosu olusturun.

        int input = 4;

        /*
            1 2 3 4
            2 4 6 8
            3 6 9 12
            4 8 12 16
         */

        // 1 2 3 4

        for (int i = 1; i <= input; i++){
            System.out.print(i+" ");
        }

        // 2 4 6 8

        System.out.println();
        for (int i = 1; i<=input;i++){
            int carpim = 1;
            carpim = i*2;
            System.out.print(carpim + " ");
        }

        // 3 6 9 12

        System.out.println();
        for (int i = 1; i<=input;i++){
            int carpim =1;
            carpim= i*3;
            System.out.print(carpim + " ");
        }

        // 4 8 12 16

        System.out.println();
        for(int i=1;i<=input;i++){
            int carpim=1;
            carpim=i*4;
            System.out.print(carpim + " ");
        }


        System.out.println(" ");
        // NESTED LOOP İLE

        for (int i = 1; i <= 4; i++) {    // outer loop

            for (int j = 1; j <= 4; j++) {  // inner loop

                System.out.print(i*j + " ");
            } // inner loop

            System.out.println(" ");
        }// outer loop

    }
}
