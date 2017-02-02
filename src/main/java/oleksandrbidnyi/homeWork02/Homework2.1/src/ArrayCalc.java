public class ArrayCalc {


    public int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        return sum;
    }

    public double sum(double array[]) {
        double sum = 0;
        for (double i : array) {

            sum += i;
        }
        return sum;
    }

    public int min(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public double min(double array[]) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double max(double array[]) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int maxPositive(int array[]) {
        int maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i]>maxPositive) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }

    public double maxPositive(double array[]) {
        double maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0&& array[i]>maxPositive) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }

    public int multiplication(int array[]) {

        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {

            multiplication *= array[i];
        }

        return multiplication;
    }

    public double multiplication(double array[]) {

        double multiplication = 1;
        for (int i = 0; i < array.length; i++) {

            multiplication *= array[i];
        }

        return multiplication;
    }

    public int modulus(int array[]) {
        int modulus = array[0] % array[9];

        return modulus;
    }

    public double modulus(double array[]) {
        double modulus = array[0] % array[9];

        return modulus;
    }

    public int secondLargest(int[] array) {
        int secondLargest = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            }
        }
        return secondLargest;
    }


    public double secondLargest(double[] array) {
        double secondLargest = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            }
        }
        return secondLargest;
    }

}


