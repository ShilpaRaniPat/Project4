package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchWords {
    public static String matchWord(String inputStr, String wordToFind) {
       //initialize an ampty string
        String resultStr="";
        //insert the pattern to be searched
        Pattern word = Pattern.compile(wordToFind);
        //find if the match is present
        Matcher match = word.matcher(inputStr);
        //initual count=0
        int count = 0;
        while (match.find()) {
            count++;
            //count through the loop and add in the string
            resultStr= resultStr+"found: " + count + " : "
                        + match.start() + " - " + match.end()+"\n";

            }
        String requiredOutput = resultStr.trim();
        return requiredOutput;

    }
}
