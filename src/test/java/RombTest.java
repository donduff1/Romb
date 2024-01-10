

import lan.zold.Romb;
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
    
}
