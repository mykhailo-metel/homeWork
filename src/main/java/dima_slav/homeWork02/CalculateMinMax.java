package Task2_1;

public class CalculateMinMax {

    public int min(int array[]) {
        if (array.length == 0){
            throw new IllegalArgumentException("The array 1 is empty");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int array[]) {
        if (array.length == 0){
            throw new IllegalArgumentException("The array 1 is empty");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        return max;
    }

    public double min(double[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("The array 2 is empty");
        }
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];

            }
        }
        return min;
    }

    public double max(double[] array){
        if (array.length == 0){
            throw new IllegalArgumentException("The array 2 is empty");
        }
        double max = array[0];
        for(int i = 0; i < array.length; i++){
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}

