import java.util.Random;
/**
 * Draws random squares
 */
public class RandomSquares
{
    public static void main(String[] args)
    {
        final int MAX_X = 200;
        final int MAX_Y = 300;
        final int MAX_LENGTH = 100;
        final int MIN_LENGTH = 20;
        final int NUMBER_OF_SQUARE = 25;
       int largestSide = 0;
        Rectangle bbox = new Rectangle();
        Random gen = new Random(123456789);
        for(int i = 0 ; i < NUMBER_OF_SQUARE ; i++)
        {

            int x = gen.nextInt(MAX_X);
            int y = gen.nextInt(MAX_Y);
            int side = gen.nextInt(MAX_LENGTH-MIN_LENGTH) + MIN_LENGTH;
            
            if (side > largestSide)
            {

                bbox = new Rectangle(x, y,side,side);
                bbox.setColor(Color.GREEN);
                bbox.draw();
            }else 
            {  Rectangle box = new Rectangle(x, y,side,side);
                box.setColor(Color.GREEN);
                box.draw();
            }

        }
        bbox.setColor(Color.BLUE);
        bbox.fill();

    }
}