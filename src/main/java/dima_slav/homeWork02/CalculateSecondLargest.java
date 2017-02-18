package Task2_1;

public class CalculateSecondLargest {

    public int secondLargest(int array[]) {
        if (array.length == 0){
            throw new IllegalArgumentException("The array 1 is empty");
        }
        int maxSec = array[0];
        int max = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i] > max){
                maxSec = max;
                max = array[i];
            }
            else if (array[i] > maxSec){
                maxSec = array[i];
            }
        }
        return maxSec;
    }

    public double secondlargest(double array[]) {
        if (array.length == 0){
            throw new IllegalArgumentException("The array 2 is empty");
        }
        double maxSec = array[0];
        double max = array[0];
        for (int i=0; i<array.length; i++){
            if (array[i] > max){
                maxSec = max;
                max = array[i];
            }
            else if (array[i] > maxSec){
                maxSec = array[i];
            }
        }
        return maxSec;
    }
}







