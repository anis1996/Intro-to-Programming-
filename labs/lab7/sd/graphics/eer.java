package graphics;

import java.util.Random;
/**
 * Draws random squares
 */
public class eer
{
    
    public static void main(String[] args)
    {int counter = 1;
        
        Robot r = new Robot();
        for(int i = 0; i < 5 ; i++)
        {
           r.turnRight();
           for (int j = 0 ; j < i ;j++)
           {r.moveForward();
            }
        
        r.turnLeft();
        counter++;
        
        
    }
    }
}