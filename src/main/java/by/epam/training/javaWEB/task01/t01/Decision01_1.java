package by.epam.training.javaWEB.task01.t01;

public class Decision01_1 {
    /***
     * Метод определяющий последнюю цифру квадрата числа по его последней цифре
     * @param number число
     * @return последняя цифра квадрата
     */
    public static int lastDigitOfSquare(int number) {
        return (number%10*number%10)%10;
    }
}
