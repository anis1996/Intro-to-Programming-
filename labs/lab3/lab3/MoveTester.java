
/**
 * Write a description of class MoveTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveTester
{
    public static void main (String[] args)
    { 
        Robot robot = new Robot();
        robot.moveHorizontally(5);
        robot.moveHorizontally(-3);
        System.out.println(robot.getX());
        System.out.println("Expected : 2");
        
    }
}
