public class Runner
{
    public static void main(String[] args)
    {
        Qualifiable[] candidates = new Qualifiable[5];

        candidates[0] = new Person("Susan", 2000.0);
        candidates[1] = new Person("Fred", 1961.99 );
        candidates[2] = new Person("Jack", 1962.00);
        candidates[3] = new Person("Amy", 1200.00 );
        candidates[4] = new Student("Thong", 3.6 );

        for (Qualifiable c : candidates)
        {
            if(c instanceof Person)
            {
                if (c.qualifies())
                {
                    Person person = (Person) c; 
                    System.out.println(person.getName());
                }
            }
        }
    }
}