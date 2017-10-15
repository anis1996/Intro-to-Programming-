/**
 * models a Emblem which gives full name and first charcter from first, middle and last name 
 */
public class Emblem{
    private String firstName;
    private String middleInitial;
    private String lastName;
    /**
     * initialize the firstname, middleintial and lastname
     * @param theFirst intialize the firstName 
     * @param theMiddleInitial intialize the middleIntial
     * @param theLast intialize the lastName
     */
    public Emblem(String theFirst, String theMiddleInitial, String theLast){
        firstName = theFirst;
        middleInitial = theMiddleInitial;
        lastName = theLast;
    }

    /**
     * initiallize the firstname and lastname without middleinitial
     * @param theFirst intialize the firstname
     * @param theLast intialize the lastname
     */
    public Emblem(String theFirst, String theLast){
        firstName = theFirst;
        middleInitial = "";
        lastName = theLast;
    }

    /**
     * get the first name 
     * @return firstName
     */
    public String getFirst(){
        return firstName;
    }

    /**
     * get the middleInitial
     * @return middleInitial
     */
    public String getMiddleInitial(){
        return middleInitial;
    }

    /**
     * get the lastname
     * @return lastName
     */
    public String getLast(){
        return lastName;
    }

}