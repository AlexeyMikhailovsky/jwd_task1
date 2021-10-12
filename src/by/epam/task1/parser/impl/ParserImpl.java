package by.epam.task1.parser.impl;
import by.epam.task1.parser.Parser;

public class ParserImpl implements Parser {

    private static final String SPLIT_REGEX = ";";

    public double[] parse(String line) {
        String[] stringArray = line.split(SPLIT_REGEX);
        double[] doubleArray = new double[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            doubleArray[i] = Double.parseDouble(stringArray[i]);
        }

        return doubleArray;
    }

}
