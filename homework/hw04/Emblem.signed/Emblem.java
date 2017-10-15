/**
 * models a Emblem 
 */
public class Emblem{
    private String firstName;
    private String middleInitial;
    private String lastName;
    /**
     * initialize the firstname, middleintial and lastname
     * @param theFirst asdfas
     * @param theMiddleInitial asdfa
     * @param theLast sfasdf
     */
    public Emblem(String theFirst, String theMiddleInitial, String theLast){
        firstName = theFirst;
        middleInitial = theMiddleInitial;
        lastName = theLast;
    }

    /**
     * initiallize the firstname and lastname without middleinitial
     * @param theFirst sadfa
     * @param theLast  sdfasdfa
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