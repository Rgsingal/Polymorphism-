class account1{
    public void money(){
        System.out.println("$ 500 can be withdraw at one time ");
    }}
class account2 extends account1{
    public void money(){
        System.out.println("Cash only be withdraw by debit card");
    }}

class account3 extends account1{
    public void money(){
        System.out.println("money can only be used through credit card");
    }
}
public class Polymorphism {

public static void main(String[] args) {
    account1 mn =new account1();
   // mn.money();

    account1 ac = new account2();
    //ac.money();

    account1 av = new account3();
    av.money();

}
}