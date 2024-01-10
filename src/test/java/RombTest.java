
import lan.zold.Romb;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RombTest {
    Romb romb;

    @BeforeTest
    public void setUp() {
        romb = new Romb (50., 60.0);
    }

    @Test
    public void testCalcPerimeter() {
        Assert.assertEquals(20.0, romb.calcPerimeter(), 0.001);
    }
    
}
