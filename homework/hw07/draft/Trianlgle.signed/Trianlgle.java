import java.util.Scanner;

public class Trianlgle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean b = false;
        int a = 0;
        while(!b)
        {
            System.out.print("How many rows in the triangle? ");
            if (in.hasNextInt())
            {

                int c = in.nextInt();
                if (c>0)
                {
                    b = true;
                    
                     a = c;
                    System.out.println(c);
                }
            }else if (in.hasNextDouble())
            {
                double c = in.nextDouble();

            }else 
            {String c = in.next();

            }
        }
        
        
        for(int i = a; i >= 1 ; i--)
        {
            for(int j = 0; j<=i  ;j++)
            {
                
                System.out.print(" ");
                
            }
            for (int t = 0 ;t <= (a-i)*2 ;t++)
            {System.out.print("+");
            }
            System.out.println();
        }

    }
}
