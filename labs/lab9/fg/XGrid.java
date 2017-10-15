import java.util.Random;

public class XGrid
{
    public static final int ROWS = 4;
    public static final int COLUMNS = 5;
    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int BLACK = 2;
    public static final int GREEN = 3;
    public static final int HEIGHT = 20;
    public static final int WIDTH = 15;
    private int x ;
    private int y ;
    private Color color ;
    private Random gen;
    public XGrid(int theX, int theY)
    {
        gen = new Random(54319577);
        x = theX;
        y = theY;
    }

    public void getRandomColor()
    {
        int random = gen.nextInt(4);
        if(random == 0)
        {
            color = Color.RED;
        }else  if(random == 1)
        {
            color = Color.BLUE;
        }else  if(random == 2)
        {
            color = Color.BLACK;
        }else  
        {
            color = Color.GREEN;
        }
    }

    public void draw()
    {
        for (int row = 0; row < ROWS; row++)
        {
            for (int i = 0; i < COLUMNS; i++ )
            {
                this.getRandomColor();
                X xGrid = new X(x+(i*WIDTH),y+(row*HEIGHT),color);
                xGrid.draw();
            }
        }
    }

}