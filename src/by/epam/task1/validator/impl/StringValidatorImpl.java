package by.epam.task1.validator.impl;

import by.epam.task1.validator.StringValidator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidatorImpl implements StringValidator {

    private static final StringValidatorImpl instance = new StringValidatorImpl();

    private StringValidatorImpl() {

    }

    public static StringValidatorImpl getInstance() {
        return instance;
    }

    public boolean validate(String line) {

        Pattern pattern = Pattern.compile(IS_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(line);

        return matcher.matches();
    }
}
