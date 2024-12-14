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
class c extends b{
    public void p2(){
        System.out.println("HELLO i'am child class ");
    }
}
public class multilevelinh2{
        public static void main(String args[]){
            // multilevel inheritance
            c t=new c();
            t.p();
            t.p1();
            t.p2();
        }
}
