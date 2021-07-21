package co.interleap.courses.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelCounterTest {

    @Test
    public void shoudCountZeroWithEmptyString(){
    	int expected =0;
    	int actual=new VowelCounter().vowelCounter("");
    	assertEquals(expected,actual);
    	
    	
    	
    }
}