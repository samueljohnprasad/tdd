package co.interleap.courses.tdd;

public class Ride {
    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MINUTE = 1;
    private final double distance;
    private final int duration;

    public Ride(double distance, int duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public int getDuration() {
        return duration;
    }

    public double invoice() {
        return getDistance() * FARE_PER_KM + getDuration() * FARE_PER_MINUTE;
    }
}
