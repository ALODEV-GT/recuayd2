package gt.com.alodev.refactor.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticUtilTest {

    public ArithmeticUtil arithmeticUtil;

    @BeforeEach
    public void setUp(){
        this.arithmeticUtil = new ArithmeticUtil();
    }

    @Test
    public void shouldCalculateArea(){
        final var DIMENSION = 3;
        var resultCircle = this.arithmeticUtil.calculateArea(Shape.CIRCLE, DIMENSION);
        var resultRectangle = this.arithmeticUtil.calculateArea(Shape.RECTANGLE, DIMENSION, DIMENSION);
        var resultTriangle = this.arithmeticUtil.calculateArea(Shape.TRIANGLE, DIMENSION,DIMENSION);


        double expectedCircle = Math.PI * DIMENSION * DIMENSION;
        double expectedRectangle = DIMENSION * DIMENSION;
        double expectedTriangle = (double) (DIMENSION * DIMENSION) / 2;

        Assertions.assertEquals(expectedCircle, resultCircle);
        Assertions.assertEquals(expectedRectangle, resultRectangle);
        Assertions.assertEquals(expectedTriangle, resultTriangle);
    }

}
