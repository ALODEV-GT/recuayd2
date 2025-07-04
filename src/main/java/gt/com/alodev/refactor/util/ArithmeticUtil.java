package gt.com.alodev.refactor.util;

public class ArithmeticUtil {

    public double calculateArea(Shape shape, double... dimensions) {
        return switch (shape) {
            case CIRCLE -> Math.PI * dimensions[0] * dimensions[0];
            case RECTANGLE -> dimensions[0] * dimensions[1];
            case TRIANGLE -> dimensions[0] * dimensions[1] / 2;
        };
    }
}
