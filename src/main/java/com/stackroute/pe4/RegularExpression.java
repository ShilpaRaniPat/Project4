package com.stackroute.pe4;
public class regularExpression {
    public boolean presenceSearch(String inputStr, String word) {
        inputStr=inputStr.toLowerCase();
        word=word.toLowerCase();
        if (!inputStr.equals(null)) {
            if (inputStr.contains(word)) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }
}




