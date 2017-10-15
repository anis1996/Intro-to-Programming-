public class TrafficLightViewer
{
    public static void main(String[] args)
    {


     Rectangle box = new Rectangle(50, 20, 20, 60);
     box.draw();
     Ellipse redcircle = new Ellipse(50, 20, 20, 20);
     redcircle.setColor(Color.RED);
     redcircle.fill();
     redcircle.draw();
     

    }
}
