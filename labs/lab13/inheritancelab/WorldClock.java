public class WorldClock extends ColoredClock
{
    private String label ;
    private int offset;
    public WorldClock(String a, int s)
    {
        label = a;
        offset = s;
    }
    
     public void update()
    {
        super.update();
        int so = 12;
        if((super.getHours()+ offset)< 0)
        {
            so = so + offset + super.getHours();
        }
        else 
        {
            so = (super.getHours()+ offset);
        }
        super.setHours(so % 24);
    }
    
    public void draw()
    {
        super.draw();
        Rectangle bounds = getBounds();
        double x = bounds.getX();
        double y = bounds.getY()+RADIUS*2;
        Text text = new Text(x, y, label);
        text.draw();
        
    }
}