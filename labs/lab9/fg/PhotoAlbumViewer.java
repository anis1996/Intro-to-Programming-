public class PhotoAlbumViewer
{
    public static void main(String[] args)
    {
        PhotoAlbum album = new PhotoAlbum();
        album.largest(); //should not throw an exception
        
        album.add(new Picture("oliver_chair.jpg"));
        album.add(new Picture("oliver_mantel.jpg"));
        album.add(new Picture("oliver_sink.jpg"));
        album.add(new Picture("oliver_sitting.jpg"));
        album.add(new Picture("oliver_sprawl.jpg"));
        
        Picture max = album.largest();
        if (max != null)
        {
            max.draw();
        }
        
        double area = album.totalArea();
        Text answer = new Text(0, 230, "Total Area: " + area);
        answer.draw();
    }
}