package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class transposalTest {
    transposal transposalObj=new transposal();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        transposalObj=null;
    }

    @Test
    public void checkTransposedSuccessCase(){

        String expectedValue="a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god";
        String actualValue=transposalObj.transposeMethod("a quick brown fox jumps over the lazy dog");
        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void checkTransposedFailureCase(){

        String expectedValue="a  kciuq  nworb  fox  spmuj  revo  eht  yzal  god";
        String actualValue=transposalObj.transposeMethod("a quick brown fox jumps over the lazy dog");
        assertNotEquals(expectedValue,actualValue);

    }
    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(transposalObj.transposeMethod(null));
    }
}