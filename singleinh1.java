import java.util.*;
class a{
    public void p(){
        System.out.println("HELLO I'am parent class");
    }
}
    class b extends a{
    public void p1(){
        System.out.println("HELLO i'am child class ");
    }
}
public class singleinh1{
        public static void main(String args[]){
            // single inheritance
            a h=new a();
            h.p();
            b t=new b();
            t.p();
            t.p1();
        }
}
