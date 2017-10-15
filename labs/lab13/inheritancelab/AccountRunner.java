import java.util.Arrays;
/**
 * Tester for BankAccount and its subclasses
 */
public class AccountRunner
{
    public static void main(String[] args)
    {

        BankAccount[] bankaccount = new BankAccount[3];
        bankaccount[0] = new BankAccount(1000,"B2222");
        bankaccount[1] = new FeeBasedAccount(1000,"F3333");
        bankaccount[2]= new SavingsAccount(1000,"S4444");

        for(int i = 0; i< bankaccount.length ; i++)
        {
            bankaccount[i].deposit(250);
            bankaccount[i].deposit(50);
            bankaccount[i].withdraw(100);
            if(bankaccount[i] instanceof FeeBasedAccount)
            {
                bankaccount[i].withdraw(100);
            }
        }

        for(int i = 0 ; i < bankaccount.length ; i++)
        {
            bankaccount[i].endOfMonth();
            System.out.printf( bankaccount[i].getAccountId()+" "+"%.2f%n" , bankaccount[i].getBalance()); 

        }
   
    }
}
