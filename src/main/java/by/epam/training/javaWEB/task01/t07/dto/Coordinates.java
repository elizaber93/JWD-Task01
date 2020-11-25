package by.epam.training.javaWEB.task01.t07.dto;

import by.epam.training.javaWEB.task01.t06.dto.Time;

public class Coordinates {
    public int x = 0;
    public int y = 0;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {
        Coordinates obj = (Coordinates)object;
        return this.x == obj.x && this.y == obj.y;
    }
}
