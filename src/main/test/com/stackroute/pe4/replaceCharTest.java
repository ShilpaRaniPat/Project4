package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.sql.JDBCType.NULL;
import static org.junit.Assert.*;

public class replaceCharTest {
    replaceChar replaceCharObj=new replaceChar();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        replaceCharObj=null;
    }
    @Test
    public void  checkReplacementSuccessTest() {
        String expectedValue = "i have reptacef att f with f anf att t with t";
        String actualValue = replaceCharObj.repalceMethod("I have replaced all d with f and all l with t", 'd', 'l', 'f', 't');
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void  checkReplacementFailureTest(){
        String expectedValue="i have reptacef att f with f and att t with t";
        String actualValue=replaceCharObj.repalceMethod("I have replaced all d with f and all l with t",'d','l','f','t');
        assertNotEquals(expectedValue,actualValue);

    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(replaceCharObj.repalceMethod(null,'\0','\0','\0','\0'));
    }

}