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
    
    @Test
    public void singleVowelAndNoConsonats() {
    	int expected =1;
    	int actual=new VowelCounter().vowelCounter("a");
    	assertEquals(expected,actual);
    	
    }
    
    @Test
    public void MultipleVowelsAndNoConsonats() {
    	int expected =5;
    	int actual=new VowelCounter().vowelCounter("aieuo");
    	assertEquals(expected,actual);
    	
    }
}