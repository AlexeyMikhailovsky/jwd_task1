package by.epam.task1.main;

import by.epam.task1.creater.CustomArrayCreater;
import by.epam.task1.creater.impl.CustomArrayCreaterImpl;
import by.epam.task1.entity.CustomArray;
import by.epam.task1.exception.CustomException;
import by.epam.task1.parser.Parser;
import by.epam.task1.parser.impl.ParserImpl;
import by.epam.task1.reader.CustomFileReader;
import by.epam.task1.reader.impl.CustomFileReaderImpl;
import by.epam.task1.service.CustomArrayService;
import by.epam.task1.service.CustomArraySortService;
import by.epam.task1.service.impl.CustomArrayServiceImpl;
import by.epam.task1.service.impl.CustomArraySortServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        CustomFileReader reader = new CustomFileReaderImpl();
        Parser pareser = new ParserImpl();
        CustomArrayCreater creater = new CustomArrayCreaterImpl();
        CustomArrayService arrayService = new CustomArrayServiceImpl();
        CustomArraySortService sortService = new CustomArraySortServiceImpl();

        try {
            String line = reader.readString("resources/arr.txt");
            double[] tempArray = pareser.parse(line);
            CustomArray array = creater.create(tempArray);

            double result;
            logger.info("Custom array : " + array);

            result = arrayService.findSum(array);
            logger.info("Sum : " + result);

            result = arrayService.findSumStream(array);
            logger.info("Sum_stream : " + result);

            result = arrayService.findMin(array);
            logger.info("Min : " + result);

            result = arrayService.findMinStream(array);
            logger.info("Min_stream : " + result);

            result = arrayService.findAvg(array);
            logger.info("Avg : " + result);

            result = arrayService.findAvgStream(array);
            logger.info("Avg_stream : " + result);

            result = arrayService.findMax(array);
            logger.info("Max : " + result);

            result = arrayService.findMaxStream(array);
            logger.info("Max_stream : " + result);

            result = arrayService.findNegative(array);
            logger.info("Negative : " + result);

            result = arrayService.findNegativeStream(array);
            logger.info("Negative_stream : " + result);

            result = arrayService.findPositive(array);
            logger.info("Positive : " + result);

            result = arrayService.findPositiveStream(array);
            logger.info("Positive_stream : " + result);

            arrayService.replaceAllNegative(array);
            logger.info("New array : " + array);

            //actionService.replaceAllNegativeStream(array);
            //logger.info("New array_stream : " + array);

            sortService.bubbleSort(array);
            logger.info("BubbleSort : " + array);

            //sortService.insertionSort(array);
            //logger.info("InsertionSort : " + array);

            //sortService.shellSort(array);
            //logger.info("Array after shellSort > " + array);

            //sortService.sortStream(array);
            //logger.info("SortStream : " + array);

        } catch (CustomException e) {
            logger.error(e);
            e.printStackTrace();
        }

    }
}
