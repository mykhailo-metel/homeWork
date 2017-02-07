import static com.sun.javafx.util.Utils.sum;


public class CalculateSecondLargest {
    public static void main(String[] args) {
        int arrayI[] = {10, 22, 24, 66, -10, -22, -14, 33, 26, 10};
        double arrayD[] = {10.5, 22.5, 24.5, 66.5, -10.5, -22.5, -14, 5, 33.5, 26.5, 10.5,};

        secondLargest(arrayI);
        secondlargest(arrayD);

    }

    public static int secondLargest(int array[]) {
        int max = array[0];
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                imax = i;
            }
        }
        int maxSec = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max && i != imax) {
                maxSec = array[i];
            } else if (array[i] != max & maxSec < array[i]) {
                maxSec = array[i];
            }
        }
        System.out.println("The maximal value of array 1 = " + max);
        System.out.println("The maximal second value of array 1 = " + maxSec);
        return maxSec;
    }

    public static double secondlargest(double array[]) {
        double max = array[0];
        double imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                imax = i;
            }
        }
        double maxSec = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max & i != imax) {
                maxSec = array[i];
            } else if (array[i] != max && maxSec < array[i]) {
                maxSec = array[i];
            }
        }
        System.out.println("The maximal value of array 2 = " + max);
        System.out.println("The maximal second value of array 2 = " + maxSec);
        return maxSec;
    }
}







