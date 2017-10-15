/**
 * Models a traffic light with red green and blue lights
 */
public class TrafficLight
{

    private int x;
    private int y;
    public static final int RED = 1;//constants 
    public static final int YELLOW = 2;
    public static final int GREEN  = 3;
    private int state;

    /**
     * Constructor for objects of class TrafficLight
     * @param theX the x coordinate of the upper left hand corner of the object
     * @param theY the y coordinate of the upper left hand corner of the object
     */
    public TrafficLight(int theX, int theY )
    {
        x = theX;
        y = theY;
        state = RED;
    }

    /**
     * Draws a representation of this TrafficLight on the canvas
     */
    public void draw()
    {
        Rectangle box = new Rectangle(x, y, 20, 60);
        box.draw();
        Color red ;
        Color yellow;
        Color green;
        if (state == RED)
        {
            red = Color.RED;
            yellow = new Color(255,165,00);
            green = new Color(85,107,47);
        }else if (state == YELLOW)
        {
            red = new Color(128,00,00);
            yellow = Color.YELLOW;
            green = new Color(85,107,47);
        }else 
        {
            red = new Color(128,00,00);
            yellow = new Color(255,165,00) ;
            green = Color.GREEN;
        }
        Ellipse redCircle = new Ellipse(x, y, 20, 20);
        redCircle.setColor(red);
        redCircle.fill();

        y = y + 20;
        Ellipse yellowCircle = new Ellipse(x, y, 20, 20);
        yellowCircle.setColor(yellow);
        yellowCircle.fill();

        y = y + 20;
        Ellipse greenCircle = new Ellipse(x, y, 20, 20);
        greenCircle.setColor(green);
        greenCircle.fill();

    }

    /**
     * get the color of light 
     * @return String color of light 
     */
    public String getLight()
    {
        String color;
        if (state == RED)
        {
            color = "red";
        }else if(state == YELLOW)
        {
            color = "yellow";

        }else 
        {
            color = "green";
        }
        return color;
    }

    /**
     * change the color of state light 
     */
    public void cycle()
    {
        if (state == RED)
        {
            state = YELLOW;
        }else if(state == YELLOW)
        {
            state = GREEN;

        }else 
        {
            state = RED;
        }

    }
}