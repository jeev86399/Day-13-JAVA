import java.util.*;
class gp{
    public void r(){
        System.out.println("HELLO I'am grand parent class");
    }
}
class p1 extends gp{
    public void r1(){
        System.out.println("HELLO i'am parent p1 class ");
    }
}
interface p2{
    public void r2();
}
class c extends p1 implements p2{
    public void r2(){
        System.out.println("HELLO i'am parent p2 class ");
    }
    public void r3(){
        System.out.println("HELLO i'am child class ");
    }
}
public class hybridinh6{
        public static void main(String args[]){
            // hybrid inheritance
            c h=new c();
            h.r();
            h.r1();
            h.r2();
            h.r3();
        }
}
