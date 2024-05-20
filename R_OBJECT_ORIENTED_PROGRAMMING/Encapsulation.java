package R_OBJECT_ORIENTED_PROGRAMMING;

class BankAccount {

    //Private member variable

    private String accountNumber;
    private String accountHolder;
    private double balance;

    //Constructor to initialize the bank account
    BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //public method to get the account balance
    public double getBalance(){
        return balance;
    }

    //public method to deposit money
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance " + balance);
        }else{
            System.out.println("Deposit amount must be positive");
        }
    }

    //public method to withdraw money
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Witdrew $" + amount + ". new balance : $ "+balance);
        }else{
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    //Public method to get account details

    public String getAccountdetails(){
        return "Account NUmber : "+accountNumber+", Account Holder : "+ accountHolder+",Balance : $"+balance;
    }

    //Main method to demonstrate the usage of BankAccount Class

    public static void main(String[] args) {
        //Create a new Bank Account

        BankAccount account = new BankAccount("42135656987","murali",1200);

        //Accessing and modifying the account balance trough public methods
        account.deposit(500);
        account.withdraw(200);

        String details = account.getAccountdetails();
        System.out.println(details);

        //Get the current balance using the public method
        double currentBalance = account.getBalance();
        System.out.println("Current Balance $"+ currentBalance);
    }

}
