package by.epam.task1.service;
import by.epam.task1.entity.CustomArray;
import by.epam.task1.service.impl.CustomArraySortServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CustomArraySortServiceTest {

    private CustomArraySortService service;
    CustomArray array;
    double[] testArray = new double[]{-2.2, 5.5, 3.3,7.7,1.1};
    double [] expected = new double[]{7.7, 5.5, 3.3, 1.1, -2.2};

    @BeforeMethod
    public void initialize() {
        array = new CustomArray(testArray);
        service = new CustomArraySortServiceImpl();
    }

    @Test
    public void testSortStream(CustomArray actual, CustomArray expected) {
        double [] actual = service.sortStream(array);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBubbleSort(CustomArray actual, CustomArray expected) {
        double [] actual = service.bubbleSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort(CustomArray actual, CustomArray expected) {
        double [] actual = service.insertionSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testShellSort(CustomArray actual, CustomArray expected) {
        double [] actual = service.shellSort(actual);
        Assert.assertEquals(actual, expected);
    }
}
