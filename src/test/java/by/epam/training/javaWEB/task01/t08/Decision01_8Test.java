package by.epam.training.javaWEB.task01.t08;

import by.epam.training.javaWEB.task01.t07.Decision01_7;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Decision01_8Test {
    private double x;
    private double expected;

    public Decision01_8Test(double x, double expected) {
        this.x = x;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {3, 9},
                {4,5},
                {Math.pow(6,1./3),Double.POSITIVE_INFINITY},
                {2, 0.5}};
        return Arrays.asList(data);
    }

    @Test
    public void getFunctionResult() {
        double actual = Decision01_8.getFunctionResult(x);

        Assert.assertEquals(expected,actual,0.00001);
    }
}