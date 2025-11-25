package oops1;

class box{
      int length,width;
    box(){
         length=5;
         width=5;
    }
    box(int l,int w){
        length=l;
        width=w;
    }
    void area(){
        System.out.println("area="+(length*width));
    }
}

public class Default_parameterised {
    public static void main(String[] args) {
        box b=new box();
        box b2=new box(3,5);
        b.area();
        b2.area();
    }
    
}
