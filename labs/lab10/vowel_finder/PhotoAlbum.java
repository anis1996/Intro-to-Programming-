import java.util.ArrayList;
/**
 * Manages an list of Picture objects
 */
public class PhotoAlbum
{
    private ArrayList<Picture> photos ;
    /**
     * intialize the array list of photos
     */
    public PhotoAlbum()
    {
        photos = new ArrayList<Picture>();
    }

    /**
     * add the picture to the array list 
     * @param picture to add into array list.
     */
    public void add(Picture picture)
    {
        photos.add(picture);
    }

    /**
     * Draws the pictures in the PhotoAlbum horizontally
     */
    public void draw()
    {
        final int GAP = 10;
        int lastX = 0;
        for (Picture p: photos)
        {
            p.translate(lastX + GAP, 0);
            lastX = p.getMaxX();
            p.draw();
        }
    }

    /**
     * get the total area of array list's pictures.
     * @return the area of of pictures 
     */
    public double totalArea()
    {
        double totalArea = 0;
        for (int i = 0; i < photos.size(); i++)
        {
            totalArea = totalArea + this.area(photos.get(i));
        }
        return totalArea;
    }

    /**
     * get the largest picture of array list and area of that picture 
     * @return the largest picture and area of that picture. 
     */
    public Picture largest()
    {
        Picture pic = new Picture();
        double largestArea = 0;  
        for(int i = 0; i < photos.size();i++)
        {
            if (area(photos.get(i)) > largestArea)
            {
                largestArea = this.area(photos.get(i));
                pic = photos.get(i);
            }
        }
        return pic; 
    }

    /**
     * get the area of picture 
     * @return the area of picture 
     */
    private double area(Picture pic)
    {
        return  pic.getWidth()*pic.getHeight();
    }
}