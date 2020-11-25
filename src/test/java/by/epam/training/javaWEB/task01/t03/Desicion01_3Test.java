package by.epam.training.javaWEB.task01.t03;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Desicion01_3Test {

    @Test
    void areaOfInscribedSquare() {
        double actual = Desicion01_3.areaOfInscribedSquare(24);

        Assert.assertEquals(12, actual, 0.001);
    }
}