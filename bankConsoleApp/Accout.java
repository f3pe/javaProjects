public class Accout {
    
    private int balance;
    Accout(){
        this.balance = 0;
    }

    public void deposit(int value){
        balance += value;
    }

    public void tranfer(int value, Accout recipient){
        balance -= value;
        recipient.deposit(value);
    }

    public int balance(){
        return balance;
    }

}
