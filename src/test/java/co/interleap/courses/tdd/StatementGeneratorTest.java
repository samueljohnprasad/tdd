package co.interleap.courses.tdd;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class StatementGeneratorTest {

	@Test
	public void bothDistanceAndtimePositiveValues() {
	   int expected = 120;
	   List<Ride> list = new ArrayList<>();
	   list.add(new Ride(10,20));
	   int actual = new StatementGenerator().create(list);
	   assertEquals(expected,actual);
	}
	
	@Test
	public void distancePostiveAndTimeNegativeValues() {
	   int expected = 0;
	   List<Ride> list = new ArrayList<>();
	   list.add(new Ride(10,-20));
	   int actual = new StatementGenerator().create(list);
	   assertEquals(expected,actual);
	}
	
	@Test
	public void distanceNegativeAndTimePostiveValues() {
	   int expected = 0;
	   List<Ride> list = new ArrayList<>();
	   list.add(new Ride(-10,20));
	   int actual = new StatementGenerator().create(list);
	   assertEquals(expected,actual);
	}

	@Test
	public void bothDistanceAndtimeNegativeValues() {
	   int expected = 0;
	   List<Ride> list = new ArrayList<>();
	   list.add(new Ride(-130,-20));
	   list.add(new Ride(-110,-120));
	   list.add(new Ride(-1,120));
	   int actual = new StatementGenerator().create(list);  
	   assertEquals(expected,actual);
	   
	}

	@Test
	public void multipleRides() {
	   int expected = 2750;
	   List<Ride> list = new ArrayList<>();
	   list.add(new Ride(130,20));
	   list.add(new Ride(110,120));
	   list.add(new Ride(12,90));
	   int actual = new StatementGenerator().create(list);
	   assertEquals(expected,actual);
	}
	
	@Test
	public void multipleRidesWithNegativevalues() {
	   int expected = 1320;
	   List<Ride> list = new ArrayList<>();
	   list.add(new Ride(130,20));
	   list.add(new Ride(-110,120));
	   list.add(new Ride(12,-90));
	   int actual = new StatementGenerator().create(list);
	   assertEquals(expected,actual);
	}
	
	  @Test
	    public void generateStatementForAJourneyGivenTotalDistance(){
	        StatementGenerator generator = new StatementGenerator();
	        int totalFare = generator.create(Collections.singletonList(new Ride(15, 0)));
	        assertEquals(150, totalFare);
	    }
	    @Test
	    public void generateStatementForAJourneyGivenTotalDistanceAndTime(){
	        StatementGenerator generator = new StatementGenerator();
	        int totalFare = generator.create(Collections.singletonList(new Ride(10, 4)));
	        assertEquals(104, totalFare);
	    }
}

