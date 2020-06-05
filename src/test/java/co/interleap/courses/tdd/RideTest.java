package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class RideTest {

    @Test
    public void shouldCalculateFareForAGivenTime(){
        assertEquals(1, new Ride(0, 1).create(), .01);
    }

    @Test
    public void shouldCalculateFareGivenADistanceAndTime(){
        assertEquals(32, new Ride(3, 2).create(), .01);
    }


}