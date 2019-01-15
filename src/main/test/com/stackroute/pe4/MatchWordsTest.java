package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class matchWordsTest {
    matchWords matchWordsObj=new matchWords();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        matchWordsObj=null;
    }
    @Test
    public void checkSuccessCase(){

        String expectedValue="found: 1 : 4 - 6\n" +
                "found: 2 : 16 - 18";
        String actualValue=matchWordsObj.matchWord("I have things have","ve");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void checkFailureCase(){

        String expectedValue="found: 1 : 4 - 6\n" +
                "found: 2 : 16 - 20";
        String actualValue=matchWordsObj.matchWord("I have things have","ve");
        assertNotEquals(expectedValue,actualValue);
    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(matchWordsObj.matchWord(null,null));
    }
}