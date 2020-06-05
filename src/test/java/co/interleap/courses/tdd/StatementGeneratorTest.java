package co.interleap.courses.tdd;

import org.junit.Test;

import static java.util.Arrays.*;
import static org.junit.Assert.assertEquals;

public class StatementGeneratorTest {

    @Test
    public void shouldCalculateFareForAGivenTime(){
        StatementGenerator statementGenerator = new StatementGenerator();
        double totalFare = new Ride(0, 1).create();
        assertEquals(1, totalFare, .01);
    }

    @Test
    public void shouldCalculateFareGivenADistanceAndTime(){
        StatementGenerator statementGenerator = new StatementGenerator();
        double totalFare = new Ride(3, 2).create();
        assertEquals(32, totalFare, .01);
    }

    @Test
    public void shouldCalculateFareForMultipleRides(){
        StatementGenerator statementGenerator = new StatementGenerator();
        double fare = statementGenerator.create(asList(new Ride(0,1), new Ride(3,2)));
        assertEquals(33, fare, .01);
    }
}
