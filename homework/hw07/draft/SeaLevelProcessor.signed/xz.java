import java.util.Scanner;

public class Trianlgle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean b = false;
        int num = 0 ;
        while(!b)
        {
            System.out.print("How many rows in the triangle? ");
            if (in.hasNextInt())
            {
                num = in.nextInt();
                if (num > 0)
                {
                    b = true;
                }
            }else
            {
                in.next();
            }
        }
        System.out.print(num);

        for(int i = num; i >= 1 ; i--)
        {
            for(int j = 0; j<= i  ;j++)
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