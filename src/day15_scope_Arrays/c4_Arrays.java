package day15_scope_Arrays;

public class c4_Arrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int[] arr2 = {2,4,5,5,2,1,556};

        String[] harfler = new String[555];   // uzunluk gerekli

        String harf1 = "ses44";


        System.out.println(arr.length);   // 3
        System.out.println(arr2.length);  // 7
        System.out.println(harfler.length); // 555

        System.out.println(harf1.length()); // 5

        // String'te kullandigimiz harf1.length() bir method iken
        // array'deki length method degil variable'dir. arr.lenght.   ,   harfler.length gibi
    }
}
