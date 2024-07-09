package DataHiding;

public class BankAccount {
    private  double balance;
    public BankAccount(double initialBalance){
        if(initialBalance>0){
            this.balance=initialBalance;
        }else{
            this.balance=0;
        }
    }
    // Public method to get the balance (read-only access)
    public double getBalance(){
        return balance;
    }

    //Public method to deposit money (controlled access)
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
        }else{
            System.out.print("Deposit amount must be greater than 1");
        }

    }
    //Control Access
    public void withdraw(double amount){
        if(amount > 0 && amount<=balance){
            balance-=amount;
        }else{
            System.out.print("Invalid withdraw amount");
        }
    }


      public static void main(String[] args){
           BankAccount account=new BankAccount(100);
           System.out.println("Creating Account");
           System.out.println("My Balance: "+account.getBalance()+"$");
           System.out.println("Deposit");
           account.deposit(50);
           System.out.println("My Balance: "+account.getBalance()+"$");
           System.out.println("Withdraw");
           account.withdraw(90);
           System.out.println("My Balance: "+account.getBalance()+"$");
      }
}
