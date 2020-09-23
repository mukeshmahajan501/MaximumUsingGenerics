import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void whenFirstFloatNum_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum(6.1f, 4.2f, 5.3f);
        Float result = maximum.getMaximumFloatNumber();
        Assert.assertEquals((Float) 6.1f, result);
    }

    @Test
    public void whenSecondFloatNum_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum(7.1f, 8.2f, 3.3f);
        Float result = maximum.getMaximumFloatNumber();
        Assert.assertEquals((Float) 8.2f, result);
    }

    @Test
    public void whenThirFloatNum_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum(10.1f, 12.2f, 13.4f);
        Float result = maximum.getMaximumFloatNumber();
        Assert.assertEquals((Float) 13.4f, result);
    }
}
