package co.interleap.courses.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatementGeneratorTest {

	@Test
	public void bothDistanceAndtimePositiveValues() {
	   int expected = 120;
	   int actual = new StatementGenerator(0,20).create();
	}
	
	@Test
	public void distancePostiveAndTimeNegativeValues() {
	   int expected = 0;
	   int actual = new StatementGenerator(10,20).create();
	}
	
	@Test
	public void distanceNegativeAndTimePostiveValues() {
	   int expected = 0;
	   int actual = new StatementGenerator(10,20).create();
	}

	@Test
	public void bothDistanceAndtimeNegativeValues() {
	   int expected = 0;
	   int actual = new StatementGenerator(10,20).create();
	}

}
