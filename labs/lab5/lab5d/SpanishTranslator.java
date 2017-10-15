/**
 * models a spanishTranslator which will translate a few spanish words to english.
 */
public class SpanishTranslator
{   
    private String spanishString; 
    /**
     * initialize the spanishString 
     * @param spanishWord spanishWord to initialize the spanishString 
     */
    public SpanishTranslator(String spanishWord)
    {
        spanishString = spanishWord;
    }

    /**
     * returns the original spanish word 
     * @return spanishString which is original spanish word
     */
    public String getSpanish(){
        return spanishString;
    }

    /**
     * set the new name to the spanishString 
     * @param spanishWord spanishWord to set new spanishString 
     */
    public  void setSpanish(String spanishWord)
    {spanishString = spanishWord;
    }
    /**
     * translate few spanish words to english words 
     * @return spanish word in english word
     */
    public String getEnglish()
    {
        String letters = spanishString.substring(0,3);
        String newString;
        if(letters.equals("el ")||letters.equals("la "))
        { newString = spanishString.replace(letters,"");
        }else
        { newString = spanishString;
        }
        if (newString.equals("estudiante"))
        {return "student" ;
        }else if(newString.equals("aprender"))
        {return "to learn";
        }else if (newString.equals("entender"))
        {return "to understand";
        }else if (newString.equals("verde"))
        {return "green";
        }else 
        {return null;
        }
    }
}    
