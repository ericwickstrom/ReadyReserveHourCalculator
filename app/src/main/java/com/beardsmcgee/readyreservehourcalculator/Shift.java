package com.beardsmcgee.readyreservehourcalculator;

import java.util.GregorianCalendar;

/**
 * A shift represents a specific punch in and out time,
 * date, work area and original person that was assigned the shift.
 */
public class Shift {
    // day and start time
    private GregorianCalendar date;
    // length of shift
    private double duration;
    // work area
    private String workArea;

    public Shift(GregorianCalendar date, double duration){
        this.date = date;
        this.duration = duration;
    }

    public GregorianCalendar getDate(){
        return date;
    }

    public void setDate(GregorianCalendar date){
        this.date = date;
    }

    public double getDuraton(){
        return duration;
    }

    public void setDuration(double duration){
        this.duration = duration;
    }

}
