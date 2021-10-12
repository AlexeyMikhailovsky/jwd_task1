package by.epam.task1.reader;
import by.epam.task1.exception.CustomException;
import by.epam.task1.reader.impl.CustomFileReaderImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomFileReaderTest {

    private CustomFileReader reader;

    @BeforeMethod
    public void initialize() {
        reader = new CustomFileReaderImpl();
    }

    @Test
    public void testReader() throws CustomException {
        String actual = reader.readString("src\\test\\resources\\arrTest.txt");
        String expected = "2.3;2.2;5.3;4;";
        Assert.assertEquals(actual, expected);
    }

}
