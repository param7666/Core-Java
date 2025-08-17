

//Question: Create a Java class BankAccount with private fields accountNumber (String),
// accountHolderName (String), and balance (double). 
//Implement getters for each field, and a setter for the balance field that ensures
// the balance cannot be set to a negative value.

public class Program04 {
    private  String accountNumber;
    private double balance;
    private String  name;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accont) {
        this.accountNumber=accont;
    }
    public String getName(){
        return name="Param";
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if(balance>0) {
            this.balance=balance;
        }
        else System.err.println("Balance should be positive integer");
    }

    public static void main(String[]args) {
        Program04 p=new Program04();
        p.setAccountNumber("7666845301759");
        p.setBalance(25000.00);
        System.out.println("Account Number: "+p.getAccountNumber());
        System.out.println("Name: "+p.getName());
        System.out.println("Available balance: "+p.getBalance());
    }

}
