package dima_slav.homeWork02;

public class CalculateSum {
    public int sum(int array[]){
        if (array.length == 0){
            throw new IllegalArgumentException("The array 1 is empty");
        }
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }
    public double sum(double array[]){
        if (array.length == 0){
            throw new IllegalArgumentException("The array 1 is empty");
        }
        double sum = 0.0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }
}
