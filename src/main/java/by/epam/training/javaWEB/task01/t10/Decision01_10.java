package by.epam.training.javaWEB.task01.t10;

public class Decision01_10 {
    /***
     * Метод, определяющий значение функции на отрезке с заданным шагом,
     * выводящий результат в виде таблицы
     * @param a начало отрезка
     * @param b конец отрезка
     * @param h шаг
     * @return массив аргументов и значений функции
     */
    public static double[][] getTgFunctionResult(double a, double b, double h) {
        double[][] resultArray = new double[(int)((b-a+1)/h)][2];
        double y = 0;
        System.out.println("|\tx\t|\ty\t|");
        System.out.println("--------------------");
        int i = 0;
        for (double x = a; x <= b ; x += h, i++) {
            y = Math.tan(x);
            resultArray[i][0]=x;
            resultArray[i][1]=y;
            System.out.println("|\t"+x+"\t|\t"+y+"\t|");
            System.out.println("--------------------");
        }
        return resultArray;
    }
}
