package Java_Variables;

public class c1_variables {

    private static int iAmClassVariable;
    private int iAmInstanceVariable;


    public static void main(String args[]) {
        int iAmLocalVariable = 3;
        System.out.println("class variable: " + iAmClassVariable);
       // System.out.println("instance variable: " + iAmInstanceVariable);   // static olmadigi icin kirmizi cizdi.
        System.out.println("local variable: " + iAmLocalVariable);

    }
}
