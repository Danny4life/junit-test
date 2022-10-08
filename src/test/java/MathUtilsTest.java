import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    /**
     * Method under test: {@link MathUtils#add(int, int)}
     */
    @Test
    void testAdd() {
        assertEquals(4, (new MathUtils()).add(2, 2));
        assertEquals(2, (new MathUtils()).add(1, 1));
        assertEquals(5, (new MathUtils()).add(3, 2));
        assertEquals(3, (new MathUtils()).add(1, 2));
    }

    /**
     * Method under test: {@link MathUtils#areaOfCircle(double)}
     */
    @Test
    void testAreaOfCircle() {
        MathUtils mathUtils = new MathUtils();

        assertEquals(314.1592653589793, mathUtils.areaOfCircle(10.0), "show the area of a circle");
    }


//    @Test
//    void testAdd() {
//        MathUtils mathUtils = new MathUtils();
//        int expected = 2;
//        int actual = mathUtils.add(1,1);
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void testAreaOfCircle(){
//        MathUtils mathUtils = new MathUtils();
//
//        assertEquals(314.1592653589793, mathUtils.areaOfCircle(10), "should give the area of a circle");
//    }
}

