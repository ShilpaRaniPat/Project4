package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.Collections;

public class sort {

    public ArrayList<String> sortWords(String inputString) {
        ArrayList<String> wordsList = new ArrayList<>();
            String[] wordsArray = inputString.split(" ");
            for (int i = 0; i < wordsArray.length; i++) {
                wordsList.add(wordsArray[i]);
            }
            Collections.sort(wordsList);
            return wordsList;
    }
}
