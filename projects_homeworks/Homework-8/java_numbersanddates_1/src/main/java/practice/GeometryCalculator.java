package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        return radius < 0 ?
                -1 :
                Math.PI * Math.pow(radius, 2);
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        return radius < 0 ?
                -1 :
                (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {

        double p = (a + b + c) / 2;

        return !isTrianglePossible(a, b, c) ?
                -1.0 :
                Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
