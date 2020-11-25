package by.epam.training.javaWEB.task01.t06.dto;

public class Time {
    public int hours = 0;
    public int minutes = 0;
    public int seconds = 0;

    public Time() {
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }



    @Override
    public boolean equals(Object object) {
        Time obj = (Time)object;
        if (this.hours == obj.hours && this.minutes == obj.minutes && this.seconds == obj.seconds) {
            return true;
        }
        return false;
    }
}
