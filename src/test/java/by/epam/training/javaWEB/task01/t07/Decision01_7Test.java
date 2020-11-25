package by.epam.training.javaWEB.task01.t07;

import by.epam.training.javaWEB.task01.t07.dto.Coordinates;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Decision01_7Test {

    @Test
    void pointCloserToCenter() {
        Coordinates point1 = new Coordinates(5,7);
        Coordinates point2 = new Coordinates(7,7);

        Coordinates expected = point1;
        Coordinates actual = Decision01_7.pointCloserToCenter(new Coordinates(0,0),point1,point2);

        Assert.assertEquals(expected,actual);
    }
}