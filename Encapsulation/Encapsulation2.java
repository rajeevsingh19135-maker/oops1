package oops1;
class student1{
    private String name;
    private double salary;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        student1 s=new student1();
        s.setname("Rajeev");
         System.out.println(s.getname());
        s.setsalary(40000);
        System.out.println(s.getsalary());

    }
}
