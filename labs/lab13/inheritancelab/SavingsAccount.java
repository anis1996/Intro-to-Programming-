/**
 * saving accout is subclass of bank account which control account by saving and person get interest
 */
public class SavingsAccount extends BankAccount
{
    public static final double ANNUAL_INTEREST = 0.009;
    
    /**
     * intilize the variables 
     */
    public SavingsAccount(double balance, String id)
    {
        super(balance, id);
    }
    
    /**
     * add the interest in account 
     */
     public void endOfMonth()
    {
        super.deposit(super.getBalance()*ANNUAL_INTEREST/12);
        
    }
}