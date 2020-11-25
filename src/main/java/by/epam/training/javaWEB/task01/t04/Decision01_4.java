package by.epam.training.javaWEB.task01.t04;

public class Decision01_4 {
    /***
     * Метод, определяющий есть ли среди заданных чисел хотя бы два четных
     * @param A 1-е число
     * @param B 2-е число
     * @param C 3-е число
     * @param D 4-е число
     * @return true - если есть хотя бы два четных
     *          false - если менее двух четных
     */
    public static boolean isTwoEvenNumber(int A, int B, int C, int D) {
        int count = 0;
        int[] numbers = new int[] {A,B,C,D};
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
            if (count == 2) return true;
        }
        return false;
    }

}
