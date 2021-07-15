package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class RideTest {
    @Test
    public void shouldCalculateFareForAGivenTime(){
        double fare = new Ride(0, 1).invoice();
        assertEquals(1, fare, .01);
    }

    @Test
    public void shouldCalculateFareForAGivenDistanceAndDuration(){
        double fare = new Ride(3, 2).invoice();
        assertEquals(32, fare, .01);
    }


}