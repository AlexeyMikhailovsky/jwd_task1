package by.epam.task1.parser;

import by.epam.task1.parser.impl.ParserImpl;
import by.epam.task1.parser.Parser;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParserTest {

    private Parser parser;
    private String testString = "1.0 3.0 4.0 56.0 4.0 ...1<";
    double[] expected = new double[]{1.0, 3.0, 4.0, 56.0, 4.0};

    @BeforeMethod
    public void initialize() {
        parser = new ParserImpl();
    }

    @Test
    public void testParse() {
        double[] actual = parser.parse(testString);
        Assert.assertEquals(actual, expected);
    }

}
