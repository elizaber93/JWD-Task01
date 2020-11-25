package by.epam.training.javaWEB.task01.t02;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Decision01_2Test {

    private int year;
    private int month;
    private int expected;

    public Decision01_2Test(int year, int month, int expected) {
        this.year = year;
        this.month = month;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {2012, 1, 31},
                {2016, 2, 29},
                {2018, 2, 28},
                {1995, 7, 31},
                {1995, 8, 31},
                {2020, 12, 31}};
        return Arrays.asList(data);
    }

    @Test
    public void numberOfDays() {
        int actual = Decision01_2.numberOfDays(year, month);
        Assert.assertEquals(expected, actual);
    }
}