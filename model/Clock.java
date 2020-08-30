package model;

import javax.swing.Timer;

public class Clock {
    double whiteClock = 0;
    double blackClock = 0;

    public Clock(double timeLimit) {
        whiteClock = blackClock = timeLimit;
    }
}