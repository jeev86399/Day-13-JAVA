import java.util.*;
interface a{
    public void p();
}
    interface b {
    public void p1();
}
class c implements b,a{
    public void p(){
        System.out.println("HELLO I'am grand parent class");
    }
    public void p1(){
        System.out.println("HELLO I'am  parent class");
    }
}
public class multiple4{
        public static void main(String args[]){
            // multiple inheritance
            c t=new c();
            t.p();
            t.p1();
        }
}
