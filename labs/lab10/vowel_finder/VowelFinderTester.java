public class VowelFinderTester
{
    public static void main(String[] args)
    {
        test("karen", "ae"); // Expected: ae
        test("alice", "aie"); // Expected: aie
        test("britain", "iai"); // Expected: iai
        test("papaya", "aaya"); // Expected: aaya
        test("","");            //Expected the empty string
    }

    public static void test(String s, String expected)
    {
        VowelFinder vf = new VowelFinder(s);
        String result = vf.findVowels();
        System.out.println("Result: " + result + "\nExpected: " + expected + "\n");
    }
}
