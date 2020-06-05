package co.interleap.courses.tdd;

public class Ride {
    private final int duration;
    private final int time;

    public Ride(int duration, int time) {
        this.duration = duration;
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public int getTime() {
        return time;
    }

    public double create() {
        return getDuration() * StatementGenerator.FARE_PER_KM + getTime() * StatementGenerator.FARE_PER_MINUTE;
    }
}
