package by.epam.training.javaWEB.task01.t09.dto;

public class Circle {
    public int radius = 0;
    public double length = 0;
    public double area = 0;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, double length, double area) {
        this.radius = radius;
        this.length = length;
        this.area = area;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.radius==((Circle) obj).radius && this.area == ((Circle) obj).area && this.length == ((Circle) obj).length) {
            return true;
        }
        return false;
    }
}
