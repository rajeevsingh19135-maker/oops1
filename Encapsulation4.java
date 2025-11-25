package oops1;
class Company{
    private final String name="TCS";

    public String getname(){
        return name;
    }
}
public class Encapsulation4 {
    public static void main(String[] args) {
        Company c=new Company();
        System.out.println(c.getname());
    }
}
