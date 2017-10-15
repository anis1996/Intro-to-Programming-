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

        Random gen = new Random(123456789);
         for (int i = 0; i <= 
        int x = gen.nextInt(MAX_X);
        int y = gen.nextInt(MAX_X);
        int side = gen.nextInt(MAX_LENGTH-MIN_LENGTH) + MIN_LENGTH;
        
        Rectangle box = new Rectangle(x, y,side,side);
        box.setColor(Color.GREEN);
        box.draw();
    }
}