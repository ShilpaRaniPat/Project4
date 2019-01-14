package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class sortTest {
    sort sortObj=new sort();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        sortObj=null;
    }
    @Test
    public void checkForSortedSuccess(){

        ArrayList<String> actualvalue = sortObj.sortWords("i have a sentence");
        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        words.add("have");
        words.add("i");
        words.add("sentence");
        ArrayList<String> expectedvalue = words;
        assertEquals(expectedvalue,actualvalue);

    }
    @Test
    public void checkForSortedFailure() {

        ArrayList<String> actualvalue = sortObj.sortWords("I have a sentence");
        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        words.add("I");
        words.add("have");
        words.add("sentence");
        ArrayList<String> expectedvalue = words;
        assertNotEquals(expectedvalue,actualvalue);
    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(sortObj.sortWords(null));
    }
}