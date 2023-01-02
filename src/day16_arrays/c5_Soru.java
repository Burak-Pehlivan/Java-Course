package day16_arrays;

public class c5_Soru {


    public static void main(String[] args) {
        // verilen bir array'deki pozitif tamsayilari toplayip sonucu bize donduren bir method yazin.

        int[] arr= {1,2,3,4,5,6,7,8,9,11,-25};
        System.out.println(pozitifToplam(arr));


    }

    public static int pozitifToplam(int[] array){
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                toplam= toplam + array[i];
            }
        }
        return toplam;
    }


}
