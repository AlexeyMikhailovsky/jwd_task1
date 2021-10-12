package by.epam.task1.service.impl;

import by.epam.task1.entity.CustomArray;
import by.epam.task1.service.CustomArrayService;
import java.util.stream.DoubleStream;

public class CustomArrayServiceImpl implements CustomArrayService {

    @Override
    public double findMax(CustomArray arr) {

        double[] tempArray = arr.getArray();
        double max = tempArray[0];

        for (int i = 1; i < tempArray.length; i++) {
            if (max < tempArray[i]) {
                max = tempArray[i];
            }
        }

        return max;
    }

    @Override
    public double findMaxStream(CustomArray arr) {

        double max = DoubleStream.of(arr.getArray())
                .max()
                .getAsDouble();

        return max;
    }

    @Override
    public double findMin(CustomArray arr) {

        double[] tempArray = arr.getArray();
        double min = tempArray[0];

        for (int i = 1; i < tempArray.length; i++) {
            if (min > tempArray[i]) {
                min = tempArray[i];
            }
        }

        return min;
    }

    @Override
    public double findMinStream(CustomArray arr) {

        double min = DoubleStream.of(arr.getArray())
                .min()
                .getAsDouble();

        return min;
    }

    @Override
    public double findAvg(CustomArray arr) {

        double[] tempArray = arr.getArray();
        double sum = 0;

        for (double elem : tempArray) {
            sum += elem;
        }

        double mid;
        mid = sum / tempArray.length;

        return mid;

    }

    @Override
    public double findAvgStream(CustomArray arr) {

        double mid = DoubleStream.of(arr.getArray())
                .average()
                .getAsDouble();

        return mid;
    }

    @Override
    public double findSum(CustomArray arr){

        double[] tempArray = arr.getArray();
        double sum = 0;

        for (double element : tempArray) {
                sum = sum + element;
        }

        return sum;
    }

    @Override
    public double findSumStream(CustomArray arr) {

        double sum = DoubleStream.of(arr.getArray())
                .sum();

        return sum;
    }

    @Override
    public int findPositive(CustomArray arr) {

        double[] tempArray = arr.getArray();
        int positive = 0;

        for (double element : tempArray) {
            if (element > 0) {
                positive++;
            }
        }

        return positive;
    }

    @Override
    public int findPositiveStream(CustomArray arr) {

        int positive = (int) DoubleStream.of(arr.getArray())
                .filter(elem -> elem > 0)
                .count();

        return positive;
    }

    @Override
    public int findNegative(CustomArray arr) {

        double[] tempArray = arr.getArray();
        int negative = 0;

        for (double element : tempArray) {
            if (element < 0) {
                negative++;
            }
        }

        return negative;
    }

    @Override
    public int findNegativeStream(CustomArray arr) {

        int negative = (int) DoubleStream.of(arr.getArray())
                .filter(elem -> elem < 0)
                .count();

        return negative;
    }

    @Override
    public CustomArray replaceAllNegativeStream(CustomArray customArray) {
        double[] array = customArray.getArray();
        double[] tempArray = DoubleStream.of(array).map(i -> i < 0 ? Math.abs(i) : i).toArray();
        return new CustomArray(tempArray);
    }

    @Override
    public CustomArray replaceAllNegative(CustomArray customArray) {
        double[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                double temp = array[i];
                array[i] = Math.abs(temp);
            }
        }
        return new CustomArray(array);
    }
}
