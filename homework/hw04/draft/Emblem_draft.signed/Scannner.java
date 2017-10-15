import java.util.Scanner;
public class Scannner
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.print("what is the price? : ");
    double price = scan.nextDouble();
    price = price * 2/3;
    System.out.print("new price is " + price);
    
    }
    
}