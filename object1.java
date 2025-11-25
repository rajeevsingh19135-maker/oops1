package oops1;

class student{
    String name="Raj";
    int age=20;
    void display(){
        System.out.println("name = "+ name + " age =" +age);
    }
}

public class object1 {
   public static void main(String[] args) {
    student s=new student();
    s.display();
   }
     
}
