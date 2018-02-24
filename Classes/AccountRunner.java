//*****************************************************************************
// Ryan Hanaway
// Account Runner
// 1/30/18
//*****************************************************************************
import java.util.Scanner;
public class AccountRunner
{
    public static void main(String[] args)
    {
        Account savings2 = new Account(123456,0.0,0.12);
        
        System.out.println(savings2.withdraw(987.65));
    }
}