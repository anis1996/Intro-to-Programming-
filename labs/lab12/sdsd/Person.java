/**
 * models a person with a name and an annualIncome
 */
public class Person implements Qualifiable
{
    private String name;
    private double monthlyIncome;

    public Person(String theName, double income)
    {
        name = theName;
        monthlyIncome = income;
    }

    public String getName()
    {
        return name;
    }

    public double getMonthlyIncome()
    {
        return monthlyIncome;
    }

    public boolean qualifies()
    {
        if (monthlyIncome >= 1962)
        {
            return false;
        }else 
        {
            return true;
        }

    }
}