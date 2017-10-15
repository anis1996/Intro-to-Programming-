/**
 * Models an Insurance client
 */
public class Insurance
{
    private Person client;

    /**
     * Constructs an Insurance object with the given Person
     * @param p the Person for this Insurance
     */
    public Insurance(Person p)
    {
        client = p;

    }

    /**
     * get the age of the client 
     * @return the age of client 
     */
    public int clientAge()
    {  
        return client.getAge();
    }

    /**
     * get the gender of the client 
     * @return the gender of the client 
     */
    public String clientGender()
    {
        return client.getGender();
    }

    /**
     * increase age of the client by 1 year.
     */
    public void incrementAge()
    {
        client.birthday();
    }

    /**
     * get the monthly insurance of the person by their age and gender
     * @return monthly premium of  the person 
     */
    public double monthlyPremium()
    {
        if (client.getAge()>= 16)
        {
            if (client.getGender().equals("m"))
            {
                if (client.getAge()<25)
                {return 85.5;
                }else if (client.getAge()>= 25 && client.getAge()< 85)
                {return 55.0;
                }else
                {
                 return 92.0;
                }
            }else 
            {
                if (client.getAge()<25)
                {return 79.25;
                }else if (client.getAge() >=25 && client.getAge()< 85)
                {return 45.0;
                }else
                {
                 return 90.0;
                }
            }
        }else
        {return -1;
        }
    }
}