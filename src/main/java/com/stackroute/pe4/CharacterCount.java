package com.stackroute.pe4;
import static java.lang.String.valueOf;
public class characterCount {
    public static Integer countMethod(String inputStr,char toreplace)
    { inputStr=inputStr.toLowerCase();
       int countChar=0;
       //check if input is zero
        if(!inputStr.equals(null))
        {
            if(inputStr.contains(valueOf(toreplace))){
                //delete the character and calculate the length , hence subtract
                 countChar=inputStr.length()-inputStr.replaceAll(valueOf(toreplace),"").length();
            }
        }

        return countChar;
    }
}
