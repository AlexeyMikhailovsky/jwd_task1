package by.epam.task1.entity;
import java.util.Arrays;

public class CustomArray {

    private double array[];

    public CustomArray() {
        super();
    }

    public CustomArray(double[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public double[] getArray(){
        return array.clone();
    }

    public void setArray(double[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        CustomArray arr = (CustomArray) o;
        return Arrays.equals(array, arr.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomArray : " + Arrays.toString(array);
    }
}
