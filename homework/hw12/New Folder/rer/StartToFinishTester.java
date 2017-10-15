/**
 * Tester for the StartToFinish class
 */
public class StartToFinishTester
{
    public static void main(String[] args)
    {
        StartToFinish processor = new StartToFinish("One day at a time");
        System.out.println(processor.firstLetters());
        System.out.println("Expected: Odaat");
        System.out.println(processor.lastLetters());
        System.out.println("Expected: eytae");

        processor = new StartToFinish("Java Rules!");
        System.out.println(processor.firstLetters());
        System.out.println("Expected: JR");
        System.out.println(processor.lastLetters());
        System.out.println("Expected: as");

        processor = new StartToFinish("Zebras, foxes, and monkeys, too. Oh, my.");
        System.out.println(processor.firstLetters());
        System.out.println("Expected: ZfamtOm");
        System.out.println(processor.lastLetters());
        System.out.println("Expected: ssdsohy");

        processor = new StartToFinish("");
        System.out.println("empty string: " + processor.lastLetters());
        System.out.println("Expected: ");
    }

}