package by.epam.training.javaWEB.task01.t09;

import by.epam.training.javaWEB.task01.t09.dto.Circle;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Decision01_9Test {

    @Test
    void getCharacteristics() {
        Circle expected = new Circle(2, 4*Math.PI, 4*Math.PI);
        Circle actual = Decision01_9.getCharacteristics(2);

        Assert.assertEquals(expected,actual);
    }
}