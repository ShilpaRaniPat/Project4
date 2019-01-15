package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class regularExpressionTest {
    regularExpression regularExpressionObj=new regularExpression();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        regularExpressionObj=null;
    }
    @Test
    public void checkWordSuccessTest(){
        boolean expectedValue=true;
        boolean actualValue=regularExpressionObj.presenceSearch("Checking for the word if it is present","for");
         assertEquals(expectedValue,actualValue);

    }
    @Test
    public void checkWordFailureTest() {
        boolean expectedValue = false;
        boolean actualValue = regularExpressionObj.presenceSearch("Checking for the word if it is present", "for");
        assertNotEquals(expectedValue, actualValue);
    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(regularExpressionObj.presenceSearch(null,null));
    }
}