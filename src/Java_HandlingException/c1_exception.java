package Java_HandlingException;

public class c1_exception {

    public static void main(String[] args) {
        int a = 10;

        try {
            System.out.println(a/0);
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("Her durumda calisir.");
        }
    }
}
