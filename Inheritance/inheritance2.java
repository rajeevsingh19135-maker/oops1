package Inheritance;
class parent{
    void home(){
        System.out.println("At home");
    }
}
class child extends parent{
    void car(){
        System.out.println("At car");
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        child c=new child();
        c.home();
        c.car();
    }
}
