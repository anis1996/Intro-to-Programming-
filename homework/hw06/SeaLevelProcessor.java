import java.util.Scanner;

public class SeaLevelProcessor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sea level or Q to quit: ");
        while (in.hasNextInt())
        { 
            int number = in.nextInt();
            System.out.print("Enter the sea level or Q to quit: ");
        }
        System.out.println("All done");
    }
}
