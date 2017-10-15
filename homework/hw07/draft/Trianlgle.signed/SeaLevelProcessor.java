import java.util.Scanner;

public class SeaLevelProcessor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int counter = 0;
        
        System.out.print("Enter the sea level or Q to quit: ");
        boolean b = true;
        int lowest = 0;
        double av = 0;
        int i = 0;
        while (in.hasNextInt())
        { 
            int number = in.nextInt();
            System.out.print("Enter the sea level or Q to quit: ");
            if (b)
            {
                lowest = number;                
                b = false;
            }
            if (number < 0 )
            {
                counter++;
            }
            if (number < lowest)
            { 
                lowest = number;
            }
            i++;
            av = av + number; 
           
        }
        if (i == 0)
        {
            System.out.print("No values entered");
        }else {
        System.out.println(counter);
        System.out.println(lowest);
        av = av / i;
        System.out.println(av);
    }
        
    }
}