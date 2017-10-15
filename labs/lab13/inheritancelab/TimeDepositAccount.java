public class TimeDepositAccount extends BankAccount
{
    public static final double RATE = 0.011;
    public static final double PENALTY = 0.2;
    private int timePeriod;
    private int count = 0;
    public TimeDepositAccount(double money, String Id, int time)
    {
        super(money,Id);
        timePeriod = time ;
    }

    public void withdraw(double amount)
    {
        if(count < timePeriod)
        {
            double finalAmount = amount + amount*PENALTY;
            super.withdraw(finalAmount);
        }else 
        {
            super.withdraw(amount);
        }

    }

    public void deposit(double amount)
    {
        super.deposit(amount);

    }

    public void endOfMonth()
    {
        super.deposit(super.getBalance()*RATE/12);
        count++;

    }
    
    public int getTimeToMaturity()
    {
        return timePeriod ;
    }
}