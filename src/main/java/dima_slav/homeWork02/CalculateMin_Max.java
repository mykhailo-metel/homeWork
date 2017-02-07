package Task2_1;

public class CalculateMinMax{
    public static void main(String[] args) {
        int arrayI[] = {10, 22, 24, 66, -10, -22, -14, 33, 26, 10};
        double arrayD[] = {10.5, 22.5, 24.5, 66.5, -10.5 -22.5, -14.5, 33.5, 26.5, 10.5};
        min(arrayI);
        max(arrayI);
        min(arrayD);
        max(arrayD);
    }

    public static int min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }

        System.out.println("The smallest value of array 1 = " + min);
        return min;
    }

    public static int max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }

        System.out.println("The largest value of array 1 = " + max);
        return max;

    }

    public static double min(double[] array){
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];

            }
        }

        System.out.println("The smallest value of array 2 = " + min);
        return min;
    }

    public static double max(double[] array){
        double max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("The largest value of array 2 = " +max);
        return max;
    }

}

