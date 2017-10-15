public class BullsEye
{
    private int x;
    private int y;
    private int d1 = 90;
    private int d2 = 60;
    private int d3 = 30;
    private Ellipse biggestCircle;
    private Ellipse smallerCircle;
    private Ellipse smallestCircle;

    /**
     * Constructs a bulls eye with a given center.
     * @param centerX the x coordinate of the center
     * @param centerY the y coordinate of the center
     */
    public BullsEye(int centerX, int centerY)
    {
        x = centerX;
        y = centerY;

    }

    /**
     * Draws the bulls eye
     */
    public void draw()
    {              
        biggestCircle = new Ellipse(x - d1 / 2, y - d1 / 2, d1, d1);
        biggestCircle.setColor(Color.BLUE);
        biggestCircle.fill();
        smallerCircle = new Ellipse(x - d2 / 2, y - d2 / 2, d2, d2);
        smallerCircle.setColor(Color.WHITE);
        smallerCircle.fill();
        smallestCircle = new Ellipse(x - d3 / 2, y - d3 / 2, d3, d3);
        smallestCircle.setColor(Color.RED);
        smallestCircle.fill();
    }

    /**
     * Increase the diameter of the BullsEye
     * @param dd the amount to increase the diameter of the largest circle by
     */
    public void grow(int growAmount){

        biggestCircle.grow(growAmount/2,growAmount/2);
       
        smallerCircle.grow(growAmount/3,growAmount/3);

        smallestCircle.grow(growAmount/6,growAmount/6);

       

    }
}     