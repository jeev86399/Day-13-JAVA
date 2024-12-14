import java.util.*;
class a{
    public void p(){
        System.out.println("HELLO I'am grand parent class");
    }
}
    class b extends a{
    public void p1(){
        System.out.println("HELLO i'am parent class ");
    }
}
class c extends a{
    public void p2(){
        System.out.println("HELLO i'am child class ");
    }
}
public class hierainh3{
        public static void main(String args[]){
            // hierarichal inheritance
            b h=new b();
            h.p1();
            h.p();
            // b object knows a & b method
            c t=new c();
            t.p();
            t.p2();
            // c object knows a & c method
        }
}
