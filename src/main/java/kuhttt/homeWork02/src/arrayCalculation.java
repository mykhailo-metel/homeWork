
public class arrayCalculation {
    private int max(int[] array){
        int max = 0;
        for (int anArray : array) {
            if (anArray > max) {
                max = anArray;
            }
        }
        return max;
    }
    private double max(double[] array){
        double max = 0;
        for (double anArray : array) {
            if (anArray > max) {
                max = anArray;
            }
        }
        return max;
    }
    private int min(int[] array) {
        int min = 0;
        for (int anArray : array) {
            if (anArray < min)
                min = anArray;
        }
        return min;
    }
    private double min(double[] array){
        double min = 0;
        for (double anArray : array) {
            if (anArray < min)
                min = anArray;
        }
        return min;
    }
    private int sum(int[] array){
        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum;
    }
    private double sum(double[] array){
        double sum = 0;
        for (double anArray : array) {
            sum += anArray;
        }
        return sum;
    }
    private int maxPositive(int[] array){
        int max = 0;
        for (int anArray : array) {
            if (anArray < 0) {
                continue;
            } else if (max < anArray) {
                max = anArray;
            }
        }
        return max;
    }
    private double maxPositive(double[] array) {
        double max = 0;
        for (double anArray : array) {
            if (anArray < 0) {
                continue;
            } else if (max < anArray)
                max = anArray;
        }
        return max;
    }
    private int multiplication(int[] array){
        int mult = array[0];
        for(int i = 1; i < array.length; i++){
            mult *= array[i];
        }
        return mult;
    }
    private double multiplication(double[] array){
        double mult = array[0];
        for(int i = 1; i < array.length; i++){
            mult *= array[i];
        }
        return mult;
    }
    private int modulus(int[] array){
        int first = array[0],last=array[array.length-1];
        return first%last;
    }
    private double modulus(double[] array){
        double first=array[0],last=array[array.length-1];
        return first%last;
    }
    private int secondLargest(int[] array){
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
    private double secondLargest(double[] array){
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
        arrayCalculation arr = new arrayCalculation();
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
