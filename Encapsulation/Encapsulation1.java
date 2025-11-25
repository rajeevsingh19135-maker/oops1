package oops1;
class stu{
    private int Id;
    
    public void setId(int Id){
       this.Id=Id;
    }
    public int getId(){
        return Id;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        stu s=new stu();
        s.setId(22);
        System.out.println(s.getId());
    }
}
