package co.interleap.courses.tdd;

import java.util.List;

public class StatementGenerator {



    public double create(List<Ride> rides) {
        return rides.stream().mapToDouble(Ride::invoice).sum();
    }
}
