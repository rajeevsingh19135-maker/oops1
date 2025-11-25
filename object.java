package oops1;

class car{
    String name;
    String color;
    void drive(){
        System.out.println("name = "+ name + " color =" +color);
    }
}

public class object {
    public static void main(String[] args) {
    car c=new car();
    c.name = "bmw";
    c.color = "red";
    c.drive();
    }
}
