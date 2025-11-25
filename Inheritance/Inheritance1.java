package Inheritance;
class A{
    void showA (){
        System.out.println("Print A");
    }
}
    class B extends A{
        void showB (){
            System.out.println("print B");
        }
    }
public class Inheritance1 {
    public static void main(String[] args) {
        B a=new B();
        a.showA();
        a.showB();
    }
}
