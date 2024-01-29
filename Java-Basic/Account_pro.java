
//Java Program to demonstrate the working of a banking-
//system where we deposit and withdraw amount from our account.
//Creating an Account class which has deposit() and withdraw() methods.
class Account{
        int acc_no;
        String name;
        float amount;

    //Method to initialize object
    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    
    //deposit method
    void deposit(float amt){
      amount=amount+amt;
      System.out.println(amt+" Deposited");
    }
    
    //withdraw method
    void withdraw(float amt){
        if (amount<amt) {
            System.out.println("Insufficient Balance");
        }else{
            amount=amount-amt;
            System.out.println(amt+" Withdrawn");
        }
    }
    
    //Method to check the balance of the account
    void checkBalance(){
        System.out.println("Balance is: "+amount);
    }
    
    //method to display the values of an object
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}
public class Account_pro {
    public static void main(String[] args) {
      Account a1 = new Account();
      System.out.println("Accounts details are given below:");
      a1.insert(100023452, "John", 1000);
      a1.display();
      a1.checkBalance();
      a1.deposit(10000);
      a1.checkBalance();
      a1.withdraw(5000);
      a1.checkBalance();
    }
}
