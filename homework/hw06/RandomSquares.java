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

        Random gen = new Random(123456789);
        
        Rectangle square = new Rectangle(gen.nextInt(201),gen.nextInt(301),gen.nextInt(121)-21,gen.nextInt(121)-21);
        square.setColor(Color.GREEN);
        square.draw();
    }
}
