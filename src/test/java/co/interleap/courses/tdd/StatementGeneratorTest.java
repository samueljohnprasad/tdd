package co.interleap.courses.tdd;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class StatementGeneratorTest {

    @Test
    public void shouldCalculateFareForMultipleRides(){
        StatementGenerator statementGenerator = new StatementGenerator();
        double fare = statementGenerator.create(asList(new Ride(3, 2), new Ride(0, 1)));
        assertEquals(33, fare, .01);
    }

}

