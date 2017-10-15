
/**
 * Draws a bigger image of my cat Oliver
 * 
 * @author (your name) 
 */
public class OliverViewer
{
    public static void main(String[] args)
    {
        Picture cat = new Picture("oliver.jpg");
        cat.translate(150,100);
        cat.grow(100,86);
        cat.draw ();
    }
}
