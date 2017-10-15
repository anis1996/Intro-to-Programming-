import java.util.Scanner;

public class TipCalculator
{
    public static void main(String[] args)
    {
        final int POOR_SERVICE = 0;
        final double POOR_TIP = .05;

        final int FAIR_SERVICE = 1;
        final double FAIR_TIP = .10;

        final int GOOD_SERVICE = 2;
        final double GOOD_TIP = .20;

        final int EXCELLENT_SERVICE = 3;
        final double EXCELLENT_TIP = .25;
        //variable for tip 
        double tip;

        Scanner in = new Scanner(System.in);
        System.out.print("What was the cost of your cruise? ");
        double cost = in.nextDouble();
        System.out.print("What was quality of service? 0 is poor and 3 is excellent: ");
        int service = in.nextInt();

        if (cost <= 0)
        {System.out.println("The cost must be a positive number");
        }else
        {
            if (service >= 0 && service <= 3)
            {   

                if (service == POOR_SERVICE)
                {
                    tip = cost*POOR_TIP;

                }else if(service == FAIR_SERVICE)
                {
                    tip = cost*FAIR_TIP;

                }else if (service == GOOD_SERVICE)
                {
                    tip = cost*GOOD_TIP;

                }else 
                {
                    tip = cost*EXCELLENT_TIP;

                }
                System.out.printf("The tip should be $%.2f", tip);
            }else 
            {
                System.out.println("The quality rating must be 0, 1, 2, or 3");
            }
        }
    }
}

