package edu.pro.tdd2;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/*
  @author   george
  @project   tdd-2
  @class  RectangleTest
  @version  1.0.0 
  @since 06.02.23 - 15.44
*/

class RectangleTest {
    Rectangle underTest = new Rectangle();
    @BeforeEach
    void setUp() {
    }

    @Test
    void itShouldCalculateArea(){
        // given
        underTest.setSideA(3);
        underTest.setSideB(4);
        //  when
        var rezult = underTest.getArea();
        // then
        assertThat(rezult).isEqualTo(12);
    }
    @Test
    void itShouldCalculateDiagonal(){
        // given
        underTest.setSideA(3);
        underTest.setSideB(5);
        //  when
        var rezult = underTest.getDiagonal();
        // then
        assertThat(rezult).isCloseTo(5.83, Percentage.withPercentage(1));
    }

    /*
     * 1. Rectangle
     * 2. Square
     * 3. Rhombus
     * 4. Trapecia
     * 5. Rivobedrenna trapecia
     * 6. Triangle
     * 7. Ravn triangle
     * 8. Rivn triamgle
     * 9. Rect trianle
     * 10. Circle
     * 11. Round
     * 12. Paralelogram
     * 13. Elips
     *
     *
     * */


}
