import java.util.*;
public class exception19{
    public static void main(String args[]){
    //try catch block
    try{
        int d=90/0;
        }
    catch(ArithmeticException v){
        System.out.println("bad Request");
    }
    try{
        int d=(90/0);
    }
    catch(ArithmeticException v){
        System.out.println("catch block is running");
    }
    finally{
        System.out.println("finally is running");
    }
}
}