package by.epam.training.javaWEB.task01.t07;

import by.epam.training.javaWEB.task01.t07.dto.Coordinates;

public class Decision01_7 {

    /***
     * Метод, определяющий,
     * какая из точек находится ближе к началу координат
     * @param center координаты центра
     * @param xy1 координаты первой точки
     * @param xy2 координаты второй точки
     * @return координаты ближайшей к центру точки
     */
    public static Coordinates pointCloserToCenter(Coordinates center, Coordinates xy1, Coordinates xy2) {
        double firstDistance;
        double secondDistance;
        firstDistance = Math.pow((Math.pow(Math.abs(center.x-xy1.x),2)+Math.pow(Math.abs(center.y-xy1.y),2)),0.5);

        secondDistance = Math.pow((Math.pow(Math.abs(center.x-xy2.x),2)+Math.pow(Math.abs(center.y-xy2.y),2)),0.5);
        if (firstDistance > secondDistance) {
            return xy2;
        } else {
            return xy1;
        }
    }
}
