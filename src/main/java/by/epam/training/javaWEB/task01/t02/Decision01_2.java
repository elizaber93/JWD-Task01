package by.epam.training.javaWEB.task01.t02;

public class Decision01_2 {
    /***
     * Метод оперделяющий количество дней в месяце
     * @param year год
     * @param month номер месяца
     * @return коичество дней
     */
    public static int numberOfDays(int year, int month) {
        boolean isLeap;
        isLeap = year % 4 == 0;

        if (month == 2) {
            if (isLeap) {
                return 29;
            }
            else return 28;
        } else {
            if (month<8) {
                if (month%2==0) {
                    return 30;
                } else {
                    return 31;
                }
            } else {
                if (month%2==0) {
                    return 31;
                } else {
                    return 30;
                }
            }
        }
    }
}
