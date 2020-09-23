import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void whenFirstNum_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum(6, 4, 5);
        int result = maximum.getMaximumNumber();
        Assert.assertEquals(6, result);
    }

    @Test
    public void whenSecondNum_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum(7, 8, 3);
        int result = maximum.getMaximumNumber();
        Assert.assertEquals(8, result);
    }

    @Test
    public void whenThirdNum_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum(10, 12, 13);
        int result = maximum.getMaximumNumber();
        Assert.assertEquals(13, result);
    }
}
