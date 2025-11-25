package oops1;

class Car{
    String brand;
    
    Car(String brand){
        this.brand=brand;
    } 
    void show(){
        System.out.println("brand="+brand);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car c=new Car("Honda");
        c.show();
    }
}
