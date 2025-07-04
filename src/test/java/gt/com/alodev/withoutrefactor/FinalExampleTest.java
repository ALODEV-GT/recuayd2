package gt.com.alodev.withoutrefactor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FinalExampleTest {

    public FinalExample finalExample;

    @BeforeEach
    public void setUp(){
        this.finalExample = new FinalExample();
    }

    @Test
    public void shouldProcessData() {
        var result = this.finalExample.processData("holamundonormal, hola, jo45");
        List<String>  expected = new ArrayList<>();
        expected.add("HOLAMUNDON");
        expected.add("HOLA");

        Assertions.assertEquals(expected,result );
    }

    @Test
    public void shouldCreateUser(){
        var result = this.finalExample.createUser("Alex", "a@mail.com", "123", "x", "x", "90");
        var expected = "User created: Alex";

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void shouldCalculateArea(){
        final var DIMENSION = 3;
        var resultCircle = this.finalExample.calculateArea("circle", DIMENSION);
        var resultRectangle = this.finalExample.calculateArea("rectangle", DIMENSION, DIMENSION);
        var resultTriangle = this.finalExample.calculateArea("triangle", DIMENSION,DIMENSION);


        double expectedCircle = Math.PI * DIMENSION * DIMENSION;
        double expectedRectangle = DIMENSION * DIMENSION;
        double expectedTriangle = (double) (DIMENSION * DIMENSION) / 2;

        Assertions.assertEquals(expectedCircle, resultCircle);
        Assertions.assertEquals(expectedRectangle, resultRectangle);
        Assertions.assertEquals(expectedTriangle, resultTriangle);
    }

}
