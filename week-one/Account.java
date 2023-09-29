public class Account {
    private float balance;
    
    public void deposit(float amount){
        balance+=amount;
    }

    public void withdraw(float amount){
        balance-=amount;
    }

    public float getBalance(){
        return balance;
    }

    public void transferFunds(Account destination, float amount){
        destination.deposit(amount);
        this.withdraw(amount);
    }

    public static void main(String[] args) {
        Account myAccount = new Account ();
        System.out.println("Welcome to Meston Bank");

        myAccount.deposit(Float.parseFloat("34.45"));
        myAccount.withdraw(Float.parseFloat("12.99"));
        myAccount.deposit(Float.parseFloat("50.00"));
        System.out.println("Your Balance is:" + myAccount.getBalance());
    }
}