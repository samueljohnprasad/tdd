package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {

    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MINUTE = 1;

    public double create(List<Ride> rides){
        return rides.stream().mapToDouble(Ride::create).sum();
    }
}
