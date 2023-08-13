public class Main{
    public static void main(String[] args){
    
        Accout p1 = new Accout();
        Accout p2 = new Accout();

        p1.deposit(3000);
        p2.deposit(5000);

        p1.tranfer(500, p2);
      
        System.out.println("The balance of p1 accout is: "+ p1.balance());
        System.out.println("The balance of p2 accout is: "+ p2.balance());
    }
}
