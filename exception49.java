import java.util.*;
public class exception49{
    public static void main(String args[])throws ArithmeticException{
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}