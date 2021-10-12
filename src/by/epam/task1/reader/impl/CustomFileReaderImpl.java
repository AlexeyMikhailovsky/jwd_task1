package by.epam.task1.reader.impl;

import by.epam.task1.exception.CustomException;
import by.epam.task1.reader.CustomFileReader;
import by.epam.task1.validator.StringValidator;
import by.epam.task1.validator.impl.StringValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class CustomFileReaderImpl implements CustomFileReader {

    static Logger logger = LogManager.getLogger();

    public String readString(String pathToFile) throws CustomException {
        StringValidator validator = StringValidatorImpl.getInstance();
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(pathToFile)))) {
            boolean isCorrect = false;
            while (!isCorrect && (line = reader.readLine()) != null) {
                isCorrect = validator.validate(line);
            }
            if (line == null) {
                line = "";
            }
        } catch (FileNotFoundException e) {
            logger.error(pathToFile + " file was not found; ", e);
            throw new CustomException(pathToFile + " file was not found; ", e);
        } catch (IOException e) {
            logger.error(pathToFile + " I/O error; ", e);
            throw new CustomException(pathToFile + " I/O error; ", e);
        }
        return line;
    }

}
