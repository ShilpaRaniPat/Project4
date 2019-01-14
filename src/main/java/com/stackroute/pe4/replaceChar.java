package com.stackroute.pe4;
import static java.lang.String.valueOf;
public class replaceChar {
    public static String repalceMethod(String inputStr,char d,char l ,char f, char t) {
           inputStr=inputStr.toLowerCase();
                 if (!inputStr.equals(null)) {
                     //check if the letters are present
                    if (inputStr.contains(valueOf(d))&&inputStr.contains(valueOf(l))) {
                        //replace
                        inputStr = inputStr.replaceAll(valueOf(d), valueOf(f));
                        inputStr=inputStr.replaceAll(valueOf(l),valueOf(t));
                        inputStr=inputStr.trim();
            }
                 }
        return inputStr;
                       }
                     }
