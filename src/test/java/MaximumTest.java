import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void whenFirstString_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum("Peach", "Apple", "Banana");
        String result = maximum.getMaximumString();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void whenSecondString_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum("Apple", "Peach", "Banana");
        String result = maximum.getMaximumString();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void whenThirdString_IsMax_ShouldReturn_True() {
        Maximum maximum = new Maximum("Apple", "Banana", "Peach");
        String result = maximum.getMaximumString();
        Assert.assertEquals("Peach", result);
    }
}
