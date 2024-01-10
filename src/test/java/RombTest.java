

import lan.zold.Romb;

import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RombTest {
    Romb romb;

    @BeforeTest
    public void setUp() {
        this.romb = new Romb();
    }

    @Test
    public void testCalcPerimeter_30() {
        double actual = this.romb.calcPerimeter(30);
        double expected = 120;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test
    public void testCalcArea_30_35() {
        double actual = this.romb.calcArea(30,35);
        double expected = 516.2;
        Assert.assertEquals(actual, expected, 1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testcalcPerimeter_Zero_Side() {
        this.romb.calcPerimeter(0);
    }
        @Test(expectedExceptions = InputMismatchException.class)
    public void testcalcArea_Zero_Angle() {
        this.romb.calcArea(30, 0);
}
}