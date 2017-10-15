import java.awt.Rectangle;
import java.util.ArrayList;
public class RectangleManager
{
    ArrayList<Rectangle> s ;
    public RectangleManager()
    {
        s = new ArrayList<Rectangle>();

    }

    public void add(Rectangle rec)
    {
        s.add(rec);
    }

    public double getMaxArea()
    {
        double area = 0; 
        for(int i = 0 ; i < s.size() ;i++)
        {
            if(s.get(i).getWidth() * s.get(i).getHeight() > area)
            {
                area = s.get(i).getWidth() * s.get(i).getHeight();
            }
        }
        return area;
    }

    public Rectangle hasAreaGreaterThan(double target)
    {
        Rectangle r = new Rectangle();
        double a = 0;
        for(int i = 0 ; i < s.size() ;i++)
        {
            if(s.get(i).getWidth() * s.get(i).getHeight() > target)
            {
                a = s.get(i).getWidth() * s.get(i).getHeight();
                r = s.get(i);
            }

        }
        if(a == 0)
        {return null;
        }else
        {

            return r;
        }
    }

    public String toString()
    {
        return s.toString();
    }
}