package by.epam.task1.creater.impl;
import by.epam.task1.creater.CustomArrayCreater;
import by.epam.task1.entity.CustomArray;

public class CustomArrayCreaterImpl implements CustomArrayCreater {

    public CustomArray create(double[] array) {
        return new CustomArray(array);
    }
}
