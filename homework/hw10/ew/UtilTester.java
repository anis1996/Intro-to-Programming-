import java.util.ArrayList;
public class UtilTester
{
    public static void main(String[] args)
    {

        
        String[] primitiveDataTypes = {"int", "double", "float", "char",
            "boolean", "long", "short", "byte"};
        System.out.println(Util.contains(primitiveDataTypes,"char"));
        System.out.println("Expected: true");
        System.out.println(Util.contains(primitiveDataTypes, "String"));
        System.out.println("Expected: false");
        
        ArrayList<String> words = new ArrayList<String>();
        System.out.println(Util.wordsStartingWith(words, 'b'));
        System.out.println("Expected: []");
        words.add("Big");
        words.add("Java");
        words.add("is");
        words.add("best");
        words.add("Be");
        words.add("the");
        words.add("computer");
        words.add("CS46A");
        System.out.println(Util.wordsStartingWith(words, 'b'));
        System.out.println("Expected: [Big, best, Be]");
        System.out.println(Util.wordsStartingWith(words, 'B'));
        System.out.println("Expected: [Big, best, Be]");
        System.out.println(Util.wordsStartingWith(words, 's'));
        System.out.println("Expected: []");
    }
}