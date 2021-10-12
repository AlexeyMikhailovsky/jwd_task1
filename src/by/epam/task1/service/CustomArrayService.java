package by.epam.task1.service;

import by.epam.task1.entity.CustomArray;
import by.epam.task1.exception.CustomException;

public interface CustomArrayService {

    double findMax(CustomArray arr);

    double findMaxStream(CustomArray arr);

    double findMin(CustomArray arr);

    double findMinStream(CustomArray arr);

    double findAvg(CustomArray arr);

    double findAvgStream(CustomArray arr);

    double findSum(CustomArray arr);

    double findSumStream(CustomArray arr) throws CustomException;

    int findPositive(CustomArray arr);

    int findPositiveStream(CustomArray arr);

    int findNegative(CustomArray arr);

    int findNegativeStream(CustomArray arr);

    CustomArray replaceAllNegativeStream(CustomArray customArray);

    CustomArray replaceAllNegative(CustomArray customArray);
}
