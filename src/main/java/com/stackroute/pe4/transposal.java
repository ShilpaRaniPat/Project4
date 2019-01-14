package com.stackroute.pe4;

import java.util.Arrays;

public class transposal {
    public static String transposeMethod(String inputStr) {
        inputStr=inputStr.toLowerCase();
        String[] wordArray = inputStr.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            StringBuilder reverseWords = new StringBuilder(wordArray[i]);
            reverseWords = reverseWords.reverse();
            wordArray[i] = reverseWords.toString();
        }
        String requiredStr = Arrays.toString(wordArray);
        requiredStr = requiredStr.substring(1,requiredStr.length()-1);
        requiredStr=requiredStr.replaceAll(","," ");
        return requiredStr;

    }
}










