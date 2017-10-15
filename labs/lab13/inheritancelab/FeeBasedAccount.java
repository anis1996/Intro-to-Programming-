/**
 * A type of BankAccount where there are charges 
 * for each transaction
 */
public class FeeBasedAccount extends BankAccount
{
    public static final double TRANSACTION_FEE = 2.00;
    public static final int FREE_TRANSACTIONS = 3;
    
    private int transactions;
    
    public FeeBasedAccount(double initialBalance, String id)
    {
        super(initialBalance, id);
        transactions = 0;      
    }
    
    public void deposit(double amount)
    {
        super.deposit(amount);
        transactions++;
    }
    
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        transactions++;
    }
    
    public void endOfMonth()
    {
        int excessTransactions = transactions - FREE_TRANSACTIONS;
        if (excessTransactions > 0)
        {
            double fee = excessTransactions * TRANSACTION_FEE;
            super.withdraw(fee);
        }
        transactions = 0;
    }
}