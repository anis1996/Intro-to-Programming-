 

import java.util.Random;
/**
 * Draws random squares
 */
public class eer
{
    
    public static void main(String[] args)
    {int counter = 1;
        
        Robot r = new Robot(5,5,"roomba.png");
        
        
        for(int i = 0; i < 10 ; i++)
        {
         
           for (int j = 0 ; j < counter ;j++)
           {r.moveForward();
            }
            
        
        r.turnLeft();
        i++;
        counter++;
        
        
    }
    }
}