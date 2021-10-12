package by.epam.task1.validator;
import by.epam.task1.validator.impl.StringValidatorImpl;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringValidatorTest {
    private static StringValidator validator = StringValidatorImpl.getInstance();

    @DataProvider(name = "testValidation")
    public Object[][] createData() {
        return new Object[][]{
                {"-5", true},
                {"4,6", false},
                {"q.wq", false},
                {"5.2", true}};
    }

    @Test(dataProvider = "testValidation")
    public void testValidate(String line, boolean expected) {
        boolean actual = validator.validate(line);
        Assert.assertEquals(actual, expected);
    }
}
