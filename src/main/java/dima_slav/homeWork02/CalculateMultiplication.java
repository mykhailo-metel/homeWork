package dima_slav.homeWork02;

public class CalculateMultiplication {
    public int multiplication(int array[]) {
        if (array.length == 0){
            throw new IllegalArgumentException("The array 1 is empty");
        }
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }

        return mult;
    }

    public double multiplication(double array[]) {
        if (array.length == 0){
            throw new IllegalArgumentException("The array 2 is empty");
        }
        double mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }

        return mult;
    }
}
