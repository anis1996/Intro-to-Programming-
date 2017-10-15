/**
 * a Parrot can be different name and it does diffent thing
 */
public class Parrot
{
    private String parrotName;
    /**
     * give the intialname of Parrot 
     * @param name set intialname to Parrot.
     */
    public Parrot(String name){
        parrotName = name;
    }

    /**
     * get the name of the Parrot 
     * @return the name of the Parrot
     */
    public String getName(){
        return parrotName;
    }

    /**
     * set a new name of Parrot 
     * @param newName set newname to parrot
     */
    public void setName(String newName){

    }

    /**
     * get the string with name + "wants a cracker".
     * @return return the string 
     */
    public String whatDoYouWant(){
        return null ;
    }

    /**
     * return the string with "Pretty" + name + "does not" + whatToDo.
     * @return return the string 
     * @param whatToDo give instruction whatToDo
     */
    public String doIt(String whatToDo){
        return null;
    }
}
