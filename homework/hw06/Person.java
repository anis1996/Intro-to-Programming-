/**
 * Models a person
 */
public class Person
{
    private String name;
    private String gender;
    private int age;
    
    /**
     * Consructs a Person object
     * @param name the name of the person
     * @param gender the gender of the person either 
     * m for male or f for female
     * @param age the age of the person
     */
    public Person(String name, String gender, int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    /**
     * gets the age of this Person
     * @return the age of this Person
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * gets the gender of this Person
     * @return the gender of this Person
     */
    public String getGender()
    {
        return gender;
    }
    
    /**
     * gets the name of this Person
     * @return the name of this Person
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Increases the age of this Person by 1 year
     */
    public void birthday()
    {
        age = age + 1;
    }
}