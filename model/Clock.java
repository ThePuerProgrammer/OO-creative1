package model;

public class Clock {
    double whiteClock = 10.0;
    double blackClock = 10.0;

    public Clock(double timeLimit) {
        whiteClock = blackClock = timeLimit;
    }

    public void updateClock(double timeLimit) {
        whiteClock = blackClock = timeLimit;
    }
}