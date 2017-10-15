import java.util.Arrays;
/**
 * Repesents a ReliefMap
 * 
 */
public class ReliefMap
{
    int[][] array = new int[15][15] ;
    public ReliefMap(int[][] data)
    {
        array = data;
    }

    public int maxDifference()
    {
        int highest = array[0][0];
        int lowest = array[0][0];

        for (int i = 0 ; i < array.length ; i++)
        {
            for (int j = 0; j< array[0].length ; j++)
            {
                if (highest < array[i][j])
                {
                    highest = array[i][j];
                }
                if (lowest > array[i][j])
                {
                    lowest = array[i][j];
                }
            }
        }
        return highest - lowest;
    }

    public void drawMap()
    {
        int width = 10;
        int height = 10;
        int x = 0;
        int y = 0;
        for (int i = 0 ; i < array.length ; i++)
        {
            for (int j = 0; j< array[0].length ; j++)
            {
                Rectangle square = new Rectangle(x,y,width,height);
                int elevation = array[i][j];
                if (elevation < -10)
                {
                    square.setColor(Color.LIGHT_GRAY);
                }else if (elevation <= 1000)
                {
                    square.setColor(Color.GRAY);
                }else 
                {
                    square.setColor(Color.GREEN);
                }
                square.fill();
                if (j==array[0].length-1)
                {
                    x = 0;
                }else 
                {
                    x = x + height;

                }
            }
            y = y + width;

        }
    }

}
