public class Lab11D
{
   public static void main(String[] args)
   {
      VisualArrayList<Picture> list = new VisualArrayList<Picture>();   
      
      list.add(new Picture("a.jpeg"));
      list.add(new Picture("b.jpeg"));
      list.add(new Picture("c.jpeg"));
      list.add(new Picture("d.jpeg"));
      list.add(new Picture("e.jpeg"));
      list.add(new Picture("f.jpeg"));
      for(int i = 0;i<list.size()/2;i++)
      {
           Picture a = list.get(0);
           list.remove(0);
           list.add(list.size(),a);
           
           
        }

      // your work here: swap the first and second parts of the array list.

   }
}
