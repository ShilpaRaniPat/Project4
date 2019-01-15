package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class characterCountTest {
    characterCount charCountObj=new characterCount();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        charCountObj=null;
    }

    @Test
    public void countCharacterSuccessTest(){

        int expectedValue=4;
        int actualValue=charCountObj.countMethod("I have a new problem associated",'a');
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void countCharacterFailureTest() {

        int expectedValue = 3;
        int actualValue = charCountObj.countMethod("I have a new problem associated", 'a');
        assertNotEquals(expectedValue, actualValue);
    }

    @Test(expected = NullPointerException.class)
        public void testInvalidCase() {
            assertNull(charCountObj.countMethod(null,'a'));
        }
     }