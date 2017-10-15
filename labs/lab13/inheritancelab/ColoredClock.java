public class ColoredClock extends Clock
{
    public void draw()
    {
        Color color = Color.YELLOW;
        Color color1 = Color.BLUE;
        Ellipse circle = new Ellipse(getX(), getY(), 2 * RADIUS, 2 * RADIUS);
        if(this.getHours()>=6 && this.getHours()< 18)
        {

            circle.setColor(color);
            circle.fill(); 
        }else 
        {
            circle.setColor(color1);
            circle.fill(); 
        }
        super.draw();
    }
    /*
    public void update()
    {
        super.update();
        super.setHours((super.getHours()+ 12) % 24);
    }
    */
}