package oops1;

class Account{
    private int balance;
    public void setbalance(int b){
        if(b>0)
            balance=b;
    }
    public int getbalance(){
        return balance;
    }
}
public class Encapsulation3 {
    public static void main(String[] args) {
        Account a=new Account();
        a.setbalance(-111);
        System.out.println(a.getbalance());
    }
}//output 0;negative balance set nahi hua Encapsulation Securty
