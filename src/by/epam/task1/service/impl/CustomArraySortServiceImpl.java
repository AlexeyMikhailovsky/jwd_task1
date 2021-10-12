package by.epam.task1.service.impl;

import by.epam.task1.entity.CustomArray;
import by.epam.task1.service.CustomArraySortService;

import java.util.stream.DoubleStream;

public class CustomArraySortServiceImpl implements CustomArraySortService {
    @Override
    public void bubbleSort(CustomArray array) {
        double[] tempArray = array.getArray();

        int n = tempArray.length;
        double temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (tempArray[j - 1] > tempArray[j]) {
                    temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }

        array.setArray(tempArray);
    }

    @Override
    public void insertionSort(CustomArray array) {
        double[] tempArray = array.getArray();

        for (int j = 1; j < tempArray.length; j++) {
            double current = tempArray[j];
            int i = j-1;
            while ((i >= 0) && (tempArray[i] > current)) {
                tempArray[i+1] = tempArray[i];
                i--;
            }
            tempArray[i+1] = current;
        }

        array.setArray(tempArray);
    }

    @Override
    public void shellSort(CustomArray array) {
        double[] tempArray = array.getArray();
        int arrLenght = tempArray.length;

        for (int step = arrLenght / 2; step > 0; step /= 2) {
            for (int i = step; i < arrLenght; i++) {
                for (int j = i - step; j >= 0; j -= step) {
                    double x = tempArray[j];
                    tempArray[j] = tempArray[j + step];
                    tempArray[j + step] = x;
                }
            }
        }

        array.setArray(tempArray);
    }

    @Override
    public void sortStream(CustomArray arr) {
        double[] sortedArray = DoubleStream.of(arr.getArray())
                .sorted()
                .toArray();
        arr.setArray(sortedArray);
    }
}
