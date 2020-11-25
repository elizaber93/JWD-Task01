package by.epam.training.javaWEB.task01.t09;

import by.epam.training.javaWEB.task01.t09.dto.Circle;

public class Decision01_9 {
    /***
     * Метод вычисляющий радиус и пощадь окружности позаданному радиусу
     * @param r радиус
     * @return переменная типа Circle,
     * соедржащая в своих полях искомые значения
     */
    public static Circle getCharacteristics(int r) {
        Circle circle = new Circle(r);

        circle.area = Math.PI * Math.pow(circle.radius,2);
        circle.length = 2 * Math.PI * circle.radius;

        return circle;
    }
}
