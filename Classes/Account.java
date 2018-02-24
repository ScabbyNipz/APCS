//*****************************************************************************
// Ryan Hanaway
// MP2 Programming Project 3
// 1/30/18
//*****************************************************************************
public class Account
{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    
    public Account ()
    {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
    }
    public Account(int i,double b, double a)
    {
     id = i;
     balance = b;
     annualInterestRate = a;
    }
    public int getId()
    {
        return id;
    }
    public double getBalance()
    {
        return balance;
    }
    public double getMonthlyInterest()
    {
        return (annualInterestRate/12);
    }
    public double withdraw(double w)
    {
        return balance = (balance - w);
    }
    public double deposit(double d)
    {
        return balance  = (balance + d);
    }
    public String toString()
    {
        return "Current account balance: $" + balance + "\nMonthly Interest"
            + " rate: " + (annualInterestRate/12) + "%";
    }
}