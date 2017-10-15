/**
   Viewer for a spiral drawing
*/
public class SpiralViewer
{
   public static void main(String[] args)
   {

      final int GRID_SIZE = 10;
      int endX = 100;
      int endY = 100;
      int startX;
      int startY;
     int c = 100;
     int d = 95;
     
     for (int n=0;n<10;n++)
     {
        startX = endX;
        startY = endY;

        endX = startX; 
        endY = startY;
        
        Line line = new Line(startX, startY, endX-c, endY);
        line.draw();
         
        Line line1 = new Line(endX-c, endY, endX -c ,endY-c);
        line1.draw();
        
          Line line2 = new Line(endX-c, endY-c, endX -c+d ,endY-c);
        line2.draw();
        
          Line line3 = new Line(endX -c+d, endY-c, endX -c +d ,endY-c+d);
        line3.draw();
         
      
        c = c - 10;
        d = d - 10;
       
       
        
        endX = endX - 5;
        endY = endY - 5;
        
        
        
        //each iteration draws one segment of the line
   }
}
}
