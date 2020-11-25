package by.epam.training.javaWEB.task01.t05;

public class Decision01_5 {
    /***
     * Метод определяющий совешенное ли число
     * @param number заданное число
     * @return true - является совершенным
     *          false - не является совершенным
     */
    public static boolean isPerfect(long number) {
        int tmp = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                tmp+=i;
            }
            if (tmp == number) return true;
        }
        return false;
    }

}
