public class CalculateMaxPositive {
    public static void main(String[] args) {
        // А что, если массив вообще не будет иметь позитивных значений и будет состоять из одних только отрицательных чисел?

        int arrayI[] = {10, 22, 24, 66, -10, -22, -14, 33, 26, 10};
        double arrayD[] = {-10.5, -22.5, -24.5, -66.5, -10.5, -22.5, -14.5, -33.5, -26, -10};

        maxPositive(arrayI);
        maxPositive(arrayD);
    }

    public static int maxPositive(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        if (max > 0) {
            System.out.println("The maximal positive number of array 1 = " + max);
        } else {
            System.out.println("Array 1 contains no positive numbers");
        }
        return max;

    }

    public static double maxPositive(double array[]) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        if (max > 0) {
            System.out.println("The maximal positive number of array 2 = " + max);
        } else {
            System.out.println("Array 2 contains no positive numbers");
        }
        return max;

    }
}



