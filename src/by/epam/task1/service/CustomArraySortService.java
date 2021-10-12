package by.epam.task1.service;

import by.epam.task1.entity.CustomArray;

public interface CustomArraySortService {

    void bubbleSort(CustomArray array);

    void insertionSort(CustomArray array);

    void shellSort(CustomArray array);

    void sortStream(CustomArray array);
}
