package by.epam.task1.service;
import by.epam.task1.entity.CustomArray;
import by.epam.task1.service.impl.CustomArrayServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomArrayServiceTest {

    private CustomArrayService service;

    @BeforeMethod
    public void initialize() {
        service = new CustomArrayServiceImpl();
    }

    @Test
    public void testFindNegative() {
        int actual = service.findNegative(new CustomArray(-3.3, -2.6, 5, -1.1));
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindNegativeStream() {
        int actual = service.findNegativeStream(new CustomArray(-3.3, -2.6, 5, -1.1));
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindAvg() {
        double actual = service.findAvg(new CustomArray(-3.3, -2.6, 5, -1.1));
        double expected = -3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindAvgStream() {
        double actual = service.findAvgStream(new CustomArray(-3.3, -2.6, 5, -1.1));
        double expected = -3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMax() {
        double actual = service.findMax(new CustomArray(-3.3, -2.6, 5, -1.1));
        double expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMaxStream() {
        double actual = service.findMaxStream(new CustomArray(-3.3, -2.6, 5, -1.1));
        double expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMin() {
        double actual = service.findMin(new CustomArray(-3.3, -2.6, 5, -1.1));
        double expected = -3.3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindMinStream() {
        double actual = service.findMinStream(new CustomArray(-3.3, -2.6, 5, -1.1));
        double expected = -3.3;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindSum() {
        double actual = service.findSum(new CustomArray(-3.3, -2.6, 5, -1.1));
        double expected = -12;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindSumStream() {
        double actual = service.findSumStream(new CustomArray(-3.3, -2.6, 5, -1.1));
        double expected = -12;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindPositive() {
        int actual = service.findPositive(new CustomArray(-3.3, -2.6, 5, -1.1));
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindPositiveStream() {
        int actual = service.findPositiveStream(new CustomArray(-3.3, -2.6, 5, -1.1));
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testReplaceAllNegativeStream() {
        CustomArray source = new CustomArray(new double[]{-3.3, -2.6, 5, -1.1});
        CustomArray expected = new CustomArray(new double[]{3.3, 2.6, 5, 1.1});
        CustomArray result = service.replaceAllNegativeStream(source);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testReplaceAllNegative() {
        CustomArray source = new CustomArray(new double[]{-3.3, -2.6, 5, -1.1});
        CustomArray expected = new CustomArray(new double[]{3.3, 2.6, 5, 1.1});
        CustomArray result = service.replaceAllNegative(source);
        Assert.assertEquals(expected, result);
    }

}
