package oops1;
class Demo{
    private void secret(){
            System.out.println("hidden");
        }
        public void show(){
           secret();
        }
}
public class Encapsulation6 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.show();
    }
}
