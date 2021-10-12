package by.epam.task1.validator;

public interface StringValidator {

    static final String IS_NUMBER_REGEX = "(\\-|\\+)?\\d+(\\.\\d+)?";

    boolean validate(String line);
}
