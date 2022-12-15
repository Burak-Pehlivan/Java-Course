package day12_MethodCreation;

public class c5_MetinTersCevir {

    public static void main(String[] args){

        System.out.println(metniTersCevir("Java Candir"));

    }

    public static String metniTersCevir(String str){

        String tersStr="";

        for (int i = str.length()-1; i>=0 ; i--){

            tersStr +=str.charAt(i);

        }

        return tersStr;
    }
}
