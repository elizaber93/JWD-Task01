package by.epam.training.javaWEB.task01.t01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Decision01_1Test {

    private int number; //число
    private int expected; //последняя цифра квадрата

    public Decision01_1Test(int number, int expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {12, 4},
                {29, 1},
                {1, 1},
                {10, 0}};
        return Arrays.asList(data);
    }

    @Test
    public void lastDigitOfSquare() {
        int actual;
        actual = Decision01_1.lastDigitOfSquare(number);

        Assert.assertEquals(expected, actual);
    }
}