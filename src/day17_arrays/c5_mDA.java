package day17_arrays;

public class c5_mDA {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4,5},{6,7,4,5}, {2}, {1,2,3,4,53}};

        // verilen 2 katli MDA'deki tum sayilarin toplamini yazdiran bir method olusturun

        mdaToplam(arr); // 54

    }
    
    public static void mdaToplam(int[][] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }
        }
        System.out.println(toplam);
    }
}
