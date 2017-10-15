/**
 * Prints how many days until the winter solstice
 * @author 
 */
public class SolsticePrinter
{
    public static void main(String[] args)
    {
        Day today = new Day ();
        System.out.println("Today is " + today.toString());
        Day wintersolstice = new Day(2016, 12, 21);
        int daysfromtoday = wintersolstice.daysFrom(today);
        System.out.println(daysfromtoday);
        Day laterdays = today.addDays(100);
        System.out.println(laterdays.getYear());
        System.out.println(laterdays.getMonth());
        System.out.println(laterdays.getDate());


        //leave this line
        System.out.println("Today is " + today.toString());
    }
}
