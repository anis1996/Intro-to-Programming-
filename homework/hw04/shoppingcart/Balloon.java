import java.util.Scanner;

public class Balloon
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Diameter: ");
      double diameter = in.nextDouble();
      double volume1;
      double volume2;
      double volume3;
volume1 = Math.pow(diameter,3)*Math.PI/6;
diameter = diameter + 1;
volume2 = Math.pow(diameter,3)*Math.PI/6;
double growth = volume2 - volume1;

    

      System.out.printf("Increase: %.0f", growth);
      System.out.println();

diameter = diameter + 1;
volume3 = Math.pow(diametervl,3)*Math.PI/6;
double growth2 = volume3 - volume2;
      

      System.out.printf("Increase: %.0f", growth2);
      System.out.println();
   }
}
