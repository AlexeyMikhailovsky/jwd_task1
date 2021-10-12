package by.epam.task1.reader;

import by.epam.task1.exception.CustomException;

public interface CustomFileReader {

    String readString(String pathToFile) throws CustomException;
}
