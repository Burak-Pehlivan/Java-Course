package day12_MethodCreation;

public class c6_Palindrome {
    public static void main(String[] args){

        String str = "Ey edip adanada pide yE";

        String tersStr = c5_MetinTersCevir.metniTersCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Verilen metin palindrome'dur. " + str);
        }
        else {
            System.out.println("verilen metin palindrome degildir. " +str);
        }

    }
}
