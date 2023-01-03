package day17_arrays;

public class c6_mDA {
    public static void main(String[] args) {

        // verilen iki katli String bir array'de
        // istenen metni iceren elementleri yazdiran bir method olusturun.

        String[][] arr = {{"Ali", "Zafer"}, {"Hakki", "Muzaffer", "Celal"}, {"Taner", "Tekin", "Mehmet", "Topal"}};

        String arananHarfinMetni = "a";

        istenenElementler(arr, arananHarfinMetni);
        istenenElementler(arr, "al");


    }

    public static void istenenElementler(String[][] arr, String aranan) {
        System.out.print("aranan: " + aranan + " harfini veya metnini icinde bulunduran elementler: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains(aranan)) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
}
