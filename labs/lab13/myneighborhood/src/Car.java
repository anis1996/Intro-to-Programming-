/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Car
{
    private int xLeft;
    private int yTop;

    private Rectangle body;
    private Ellipse frontTire;
    private Ellipse rearTire;
    private Line frontWindshield;
    private Line roofTop;
    private Line rearWindshield;

    /**
       Constructs a car with a given top left corner.
       @param x the x coordinate of the top left corner
       @param y the y coordinate of the top left corner
    */
    public Car(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
       Draws this car.
    */
    public void draw()
    {
        body = new Rectangle(xLeft, yTop + 10, 60, 10);
        frontTire = new Ellipse(xLeft + 10, yTop + 20, 10, 10);
        rearTire = new Ellipse(xLeft + 40, yTop + 20, 10, 10);

        frontWindshield = new Line(xLeft + 10, yTop + 10, xLeft + 20, yTop);
        roofTop = new Line(xLeft + 20, yTop, xLeft + 40, yTop);
        rearWindshield = new Line(xLeft + 40, yTop, xLeft + 50, yTop + 10);

        body.draw();
        frontTire.fill();
        rearTire.fill();
        frontWindshield.draw();
        roofTop.draw();
        rearWindshield.draw();
    }
}
