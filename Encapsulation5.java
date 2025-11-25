package oops1;
class Circle{
    private double radius;
    public void setradius(double r){
        radius=r;
    }
       public double area(){
        return 3.14*radius*radius;
       }
}
public class Encapsulation5 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.setradius(2);
        System.out.println(c.area());
    }
}
//Encapsulation with method
