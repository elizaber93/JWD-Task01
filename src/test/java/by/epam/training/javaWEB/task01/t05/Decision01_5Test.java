package by.epam.training.javaWEB.task01.t05;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Decision01_5Test {

    private long number;
    private boolean expected;

    public Decision01_5Test(long number, boolean expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {6,true},
                {28,true},
                {496,true},
                {8128, true},
                {56, false},
                {27,false},
                {0,false}};
        return Arrays.asList(data);
    }

    @Test
    public void isPerfect() {
        boolean actual = Decision01_5.isPerfect(number);

        Assert.assertEquals(expected, actual);
    }
}