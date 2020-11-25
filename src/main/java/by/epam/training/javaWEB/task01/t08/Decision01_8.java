package by.epam.training.javaWEB.task01.t08;

public class Decision01_8 {
    /***
     *Метод вычисляющий значение функции, определенной на отрезках
     * @param x аргумент
     * @return значение функции
     */
    public static double getFunctionResult(double x) {
        double result;
        if (x >= 3) {
            result = - Math.pow(x,2) + 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x,3) - 6);
        }
        return result;
    }
}
