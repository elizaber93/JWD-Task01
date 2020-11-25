package by.epam.training.javaWEB.task01.t06;

import by.epam.training.javaWEB.task01.t06.dto.Time;

public class Decision01_6 {
    /***
     * Метод по количеству секунд определяющий время,
     * т.е. часы, минуты, секунды
     * @param fullSec - n-я секунда суток
     * @return время типа Time
     */
    public static Time whatTimeIsIt(int fullSec) {
        Time time = new Time();
        time.hours = fullSec/3600;
        fullSec -= time.hours*3600;
        time.minutes = fullSec/60;
        fullSec -= time.minutes*60;
        time.seconds = fullSec;
        return time;
    }

}
