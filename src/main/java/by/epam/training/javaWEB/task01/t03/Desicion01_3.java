package by.epam.training.javaWEB.task01.t03;

public class Desicion01_3 {
    /***
     * Метод определяющий площадь квадрата,
     * вписанного в окружность, вписанную в квардрат заданной площади
     * Математически следует, что данная площадь в 2 раза меньше
     * площади исходного квадрата
     * @param squareArea площадь квадрата
     * @return искомая площадь
     */
    public static double areaOfInscribedSquare(double squareArea) {
        return squareArea/2;
    }

}
