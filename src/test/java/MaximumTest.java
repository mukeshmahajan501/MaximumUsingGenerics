import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //Test cases for Maximum Integer
    @Test
    public void givenMaxValue_atPosition1_shouldReturn_maximumNumber() {
        Maximum maximum = new Maximum();
        int maximumNumber = (int) maximum.testMaximumValue(6, 4, 5, 3);
        Assert.assertEquals(6, maximumNumber);
    }

    @Test
    public void givenMaxValue_atPosition2_shouldReturn_maximumNumber() {
        Maximum maximum = new Maximum();
        int maximumNumber = (int) maximum.testMaximumValue(7, 8, 3, 5);
        Assert.assertEquals(8, maximumNumber);
    }

    @Test
    public void givenMaxValue_atPosition3_shouldReturn_maximumNumber() {
        Maximum maximum = new Maximum();
        int maximumNumber = (int) maximum.testMaximumValue(10, 12, 13, 9);
        Assert.assertEquals(13, maximumNumber);
    }

    @Test
    public void givenMaxValue_atPosition4_shouldReturn_maximumNumber() {
        Maximum maximum = new Maximum();
        int maximumNumber = (int) maximum.testMaximumValue(1, 12, 14, 8);
        Assert.assertEquals(14, maximumNumber);
    }

    //Test cases for maximum float
    @Test
    public void givenMaxValue_atPosition1_shouldReturn_maximumFloat() {
        Maximum maximum = new Maximum();
        Comparable maximumFloat = maximum.testMaximumValue(6.1f, 4.2f, 5.3f, 2.1f);
        Assert.assertEquals(6.1f, maximumFloat);
    }

    @Test
    public void givenMaxValue_atPosition2_shouldReturn_maximumFloat() {
        Maximum maximum = new Maximum();
        Comparable maximumFloat = maximum.testMaximumValue(7.1f, 8.2f, 3.3f, 2.7f);
        Assert.assertEquals(8.2f, maximumFloat);
    }

    @Test
    public void givenMaxValue_atPosition3_shouldReturn_maximumFloat() {
        Maximum maximum = new Maximum();
        Comparable maximumFloat = maximum.testMaximumValue(10.1f, 12.2f, 13.4f, 11.3f);
        Assert.assertEquals(13.4f, maximumFloat);
    }

    @Test
    public void givenMaxValue_atPosition4_shouldReturn_maximumFloat() {
        Maximum maximum = new Maximum();
        Comparable maximumFloat = maximum.testMaximumValue(14.1f, 12.2f, 18.4f, 17.3f);
        Assert.assertEquals(18.4f, maximumFloat);
    }

    //Test cases for String
    @Test
    public void givenMaxValue_atPosition1_shouldReturn_maximumString() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.testMaximumValue("Peach", "Apple", "Banana", "Mango");
        Assert.assertEquals("Peach", maximumString);
    }

    @Test
    public void givenMaxValue_atPosition2_shouldReturn_maximumString() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.testMaximumValue("Apple", "Peach", "Banana", "Mango");
        Assert.assertEquals("Peach", maximumString);
    }

    @Test
    public void givenMaxValue_atPosition3_shouldReturn_maximumString() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.testMaximumValue("Apple", "Banana", "Peach", "Mango");
        Assert.assertEquals("Peach", maximumString);
    }

    @Test
    public void givenMaxValue_atPosition4_shouldReturn_maximumString() {
        Maximum maximum = new Maximum();
        String maximumString = (String) maximum.testMaximumValue("Mango", "Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maximumString);
    }
}
