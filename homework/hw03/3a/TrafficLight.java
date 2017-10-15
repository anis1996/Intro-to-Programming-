/**
 * a trafficlight that draw traffic lights at diffrent places  
 */
public class TrafficLight
{
    private int x;
    private int y; 
    private int width = 20;
    private int height = 60;
    /**
     * construct a TrafficLight with given x and y points.
     * @param xPoint intialize x point 
     * @param yPoint intialize y point
     */
    public TrafficLight(int xPoint, int yPoint){
        x = xPoint;
        y = yPoint;
    }

    /**
     * draw a TrafficLight at diffrent points 
     */
    public void draw(){
        Rectangle box = new Rectangle (x, y, width, height);
        box.draw();
        Ellipse redCircle = new Ellipse(x, y, 20, 20);
        redCircle.setColor(Color.RED);
        redCircle.fill();
        Ellipse yellowCircle = new Ellipse(x, y+20, 20, 20);
        yellowCircle.setColor(Color.YELLOW);
        yellowCircle.fill();
        Ellipse greenCircle = new Ellipse(x, y+40, 20, 20);
        greenCircle.setColor(Color.GREEN);
        greenCircle.fill();
    }

}
