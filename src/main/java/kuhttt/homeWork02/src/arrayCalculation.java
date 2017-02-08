
public class ArrayCalculation {

    public int max(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public double max(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double max = 0;
        for (double element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int min(int[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int min = 0;
        for (int element : array) {
            if (element < min)
                min = anArray;
        }
        return min;
    }

    public double min(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double min = 0;
        for (double element : array) {
            if (element < min)
                min = element;
        }
        return min;
    }

    public int sum(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public double sum(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    public int maxPositive(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int max = 0;
        for (int element : array) {
             if (element > 0 && max < element) {
                max = element;
            }
        }
        return max;
    }

    public double maxPositive(double[] array) {
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double max = 0;
        for (double element : array) {
             if (element > 0 && max < element)
                max = element;
        }
        return max;
    }

    public int multiplication(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int mult = array[0];
        for(int i = 1; i < array.length; i++){
            mult *= array[i];
        }
        return mult;
    }

    public double multiplication(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double mult = array[0];
        for(int i = 1; i < array.length; i++){
            mult *= array[i];
        }
        return mult;
    }

    public int modulus(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        if (array[array.length-1]==0) {
            throw new IllegalArgumentException("Error! Division by zero!");
        }
            return array[0] % array[array.length - 1];
        }
    }

    public double modulus(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        if (array[array.length-1]==0) {
            throw new IllegalArgumentException("Error! Division by zero!");
        }
        return array[0] % array[array.length - 1];
        }
    }

    public int secondLargest(int[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        int max = array[0];
        int secMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                secMax = max;
                max = array[i];
            } else if(array[i] > secMax) {
                secMax = array[i];
            }
        }
        return secMax;
    }

    public double secondLargest(double[] array){
        if (array.length == 0 || array == null) {
            throw new IllegalArgumentException ("Array is empty!");
        }
        double max = array[0];
        double secMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                secMax = max;
                max = array[i];
            } else if(array[i] > secMax) {
                secMax = array[i];
            }
        }
        return secMax;

    }

    public static void main(String[] args) {
        ArrayCalculation arr = new ArrayCalculation();
        int[] iArray = {1, 23, -45, 22, 209, 0, -33, 10, 8, -9};
        double[] dArray = {3.2, 4.88, -0.12, 444, 555, -4653.1, 5, 98, -75.333};
        System.out.println(
                        "Sum for int = " + arr.sum(iArray) + "\n" +
                        "Sum for double = " + arr.sum(dArray) + "\n" +
                        "=============================" + "\n" +
                        "Max for int = " + arr.max(iArray) + "\n" +
                        "Max for double = " + arr.max(dArray) + "\n" +
                        "=============================" + "\n" +
                        "Min for int = " + arr.min(iArray) + "\n" +
                        "Min for double = " + arr.min(dArray) + "\n" +
                        "=============================" + "\n" +
                        "MaxPositive for int = " + arr.maxPositive(iArray) + "\n" +
                        "MaxPositive for double = " + arr.maxPositive(dArray) + "\n" +
                        "=============================" + "\n" +
                        "Multiplication for int = " + arr.multiplication(iArray) + "\n" +
                        "Multiplication for double = " + arr.multiplication(dArray) + "\n" +
                        "=============================" + "\n" +
                        "Modulus for int = " + arr.modulus(iArray) + "\n" +
                        "Modulus for double = " + arr.modulus(dArray) + "\n" +
                        "=============================" + "\n" +
                        "SecondLargest for int = " + arr.secondLargest(iArray) + "\n" +
                        "SecondLargest for double = " + arr.secondLargest(dArray)
        );
    }

}
