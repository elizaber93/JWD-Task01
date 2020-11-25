package by.epam.training.javaWEB.task01.t04;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class Decision01_4Test {

    private int A;
    private int B;
    private int C;
    private int D;
    private boolean expected;

    public Decision01_4Test(int a, int b, int c, int d, boolean expected) {
        A = a;
        B = b;
        C = c;
        D = d;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                {2,5,7,9,false},
                {2,4,5,3,true},
                {5,7,9,1,false},
                {1,2,3,4, true},
                {1,2,4,6,true},
                {2,4,6,8,true}};
        return Arrays.asList(data);
    }

    @Test
    public void isTwoEvenNumber() {
        boolean actual = Decision01_4.isTwoEvenNumber(A,B,C,D);

        Assert.assertEquals(expected, actual);
    }
}