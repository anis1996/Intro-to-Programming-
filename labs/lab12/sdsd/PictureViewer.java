public class PictureViewer
{
   public static void main(String[] args)
   {
        Picture blimp = new Picture("blimp.jpg");
         
        int[][] grayscale = blimp.getGrayLevels();
        int[][] s = new int[blimp.getWidth()][blimp.getHeight()] ;
        for (int i = 0; i < blimp.getWidth()-1; i++)
        {
            for(int j = 0; j < blimp.getHeight()-1;j++)
            {
                 s[i][ blimp.getHeight()-j-1] = grayscale[j][i];
                                  
            }
        }
         
        Picture grayBlimp = new Picture(s);
        grayBlimp.draw();      
   }
}
