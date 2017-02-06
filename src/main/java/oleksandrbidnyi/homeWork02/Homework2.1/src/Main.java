public class Main {

    public static void main(String[] args) {

        int[] arraysOfIntegers = {-1, 2, -3, 4, 5, 6, 7, 8, 5, -12};

        double[] arraysOfDouble = {-1.9, 2.5, -3.4, 4.6, 5.5, 6.6, 7.3, 8.9, 9.1, 12.2};
        ArrayCalc arrayCalc = new ArrayCalc();

        System.out.println("Sum of integer array: " + arrayCalc.sum(arraysOfIntegers));
        System.out.println("Sum of double array: " + arrayCalc.sum(arraysOfDouble));

        System.out.println("Min of integer array: " + arrayCalc.min(arraysOfIntegers));
        System.out.println("Min of double array: " + arrayCalc.min(arraysOfDouble));

        System.out.println("Max of integer array: " + arrayCalc.max(arraysOfIntegers));
        System.out.println("Max of double array: " + arrayCalc.max(arraysOfDouble));

        System.out.println("maxPositive of integer array: " + arrayCalc.maxPositive(arraysOfIntegers));
        System.out.println("maxPositive of double array: " + arrayCalc.maxPositive(arraysOfDouble));

        System.out.println("multiplication of integer array: " + arrayCalc.multiplication(arraysOfIntegers));
        System.out.println("multiplication of double array: " + arrayCalc.multiplication(arraysOfDouble));

        System.out.println("Modulus of integer array: " + arrayCalc.modulus(arraysOfIntegers));
        System.out.println("Modulus of double array: " + arrayCalc.modulus(arraysOfDouble));

        System.out.println("secondLargest of integer array: " + arrayCalc.secondLargest(arraysOfIntegers));
        System.out.println("secondLargest of double array: " + arrayCalc.secondLargest(arraysOfDouble));

    }
}


