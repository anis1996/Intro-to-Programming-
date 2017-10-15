import java.util.ArrayList;

public class VocabTester
{

    public static void main(String[] args)
    {
        ArrayList<String> theList = new ArrayList<>();
        Vocab empty = new Vocab(theList);
        System.out.println(empty.longest());
        System.out.println("Expected: null");
        System.out.println(empty.averageLength());
        System.out.println("Expected: 0.0");
        empty.remove("interface");
        System.out.println(empty);
        System.out.println("Expected: []");
       
        theList.add("polymorphism");
        theList.add("interface");
        theList.add("encapsulation");
        theList.add("interface");
        theList.add("object-oriented");
        theList.add("java");
        theList.add("programming");
        Vocab vocab = new Vocab(theList);
        
        System.out.println(vocab.longest());
        System.out.println("Expected: object-oriented");
        System.out.printf("%.2f\n", vocab.averageLength());
        System.out.println("Expected: 10.43");
        vocab.remove("interface");
        vocab.remove("java");
        System.out.println(vocab);
        System.out.println("Expected: [polymorphism, encapsulation, object-oriented, programming]");
        
        
    }
}