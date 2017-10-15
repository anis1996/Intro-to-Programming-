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
    /**
     * count the character in the string not space 
     *@return chartcher count in fullname
     */
    public int characterCount(){
    String string = firstName + middleInitial + lastName;
    return string.length();
    
    }
    /**
     * @return the full name 
     */
    public String getFullName(){
    return firstName + " " + middleInitial + " " + lastName; 
    }
    /**
     * @return the string of the intial 
     */
    public String getEmblem(){
        
        char firstLetter = firstName.charAt(0);
        char lastLetter = lastName.charAt(0);
        return  "" + firstLetter + middleInitial + lastLetter ;
    
    }

}