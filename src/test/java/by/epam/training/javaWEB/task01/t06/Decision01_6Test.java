package by.epam.training.javaWEB.task01.t06;

import by.epam.training.javaWEB.task01.t06.dto.Time;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class Decision01_6Test {

    @Test
    void whatTimeIsIt() {
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int seconds = calendar.get(Calendar.SECOND);
        Time expected = new Time(hour,minutes,seconds);
        Time actual = Decision01_6.whatTimeIsIt(hour*3600+minutes*60+seconds);

        Assert.assertEquals(expected, actual);
    }
}