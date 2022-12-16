
public class ForLoopTurnary {
    public static void main(String[] args) {

        String input = "java candir gerisi heyecandir.";

        for (int i = 0; i< input.length();i++){

            System.out.print(i%2==0
                                ? input.substring(i,i+1).toUpperCase()
                                : input.substring(i,i+1).toLowerCase());
        }

        String str = "Java code yaz";

        System.out.println(str.substring(8,8));  // Çıktıda hiçbir şey vermez.



    }
}
