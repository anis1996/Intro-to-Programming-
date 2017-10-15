
/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Picture pic;

    /**
     * Constructor for objects of class Robot
     */
    public Robot()
    {
        pic = new Picture("myrobot.jpeg");
        x = 0;
        pic.draw();
    }

    /**
    Gets the horizontal grid location of this robot.
    @return the horizontal grid location
     */        
    public int getX()
    {
        return x;  
    }

    /**
     * we want the robot to move right 
     * we want the robot to move down 
     * 
     * 
     */
    public void moveright()
    {
        pic.getWidth();
        pic.translate(pic.getWidth(),0);

    }
    /**
     * we want the robot to move down 
     * 
     * 
     */
    public void movedown()
    {
        pic.getHeight();
        pic.translate(0,pic.getHeight());

    }
    /**
     * 
     * 
     * 
     */
    public void moveHorizontally(int x)
    /**
     * @ param x is the horizontal grid locattion of the robot 
     * 
     * 
     */
    {
        pic.translate(x*pic.getWidth(),0);
    }

    public void moveVertically(int y)
    {
        pic.translate(0,y*pic.getHeight());
    }
}
