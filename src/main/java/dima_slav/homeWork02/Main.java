package dima_slav.homeWork02;

public class Main {
    public static void main(String[] args) {

        int arrayI[] = {36, 22, 24, 66, -10, -22, -14, 33, 26, 10};
        double arrayD[] = {36.5, 22.5, 24.5, 66.5, -10.5, -22.5, -14.5, 33.5, 26.5, 10.5};

        CalculateSum calculateSum = new CalculateSum();
        CalculateMinMax calculateMinMax = new CalculateMinMax();
        CalculateMaxPositive calculateMaxPositive = new CalculateMaxPositive();
        CalculateMultiplication calculateMultiplication = new CalculateMultiplication();
        CalculateModulus calculateModulus = new CalculateModulus();
        CalculateSecondLargest calculateSecondLargest = new CalculateSecondLargest();


        System.out.println("The sum of array 1 = " + calculateSum.sum(arrayI));
        System.out.println("The sum of array 2 = " + calculateSum.sum(arrayD));

        System.out.println("The minimal value of array 1 = " + calculateMinMax.min(arrayI));
        System.out.println("The maximal value of  array 1 = " + calculateMinMax.max(arrayD));
        System.out.println("The minimal value of array 2 = " + calculateMinMax.min(arrayI));
        System.out.println("The maximal value of array 2 = " + calculateMinMax.max(arrayD));

        System.out.println("The maximal positive value of array 1 = " + calculateMaxPositive.maxPositive(arrayI));
        System.out.println("The maximum positive value of array 2 = " + calculateMaxPositive.maxPositive(arrayD));

        System.out.println("The multiplication result of array 1 = " + calculateMultiplication.multiplication(arrayI));
        System.out.println("The multiplication result of array 2 = " + calculateMultiplication.multiplication(arrayD));

        System.out.println("The modulus result of array 1 = " + calculateModulus.modulus(arrayI));
        System.out.println("The modulus result of result 2 = " + calculateModulus.modulus(arrayD));

        System.out.println("The second maximal value of array 1 = " + calculateSecondLargest.secondLargest(arrayI));
        System.out.println("The second maximal value of array 2 = " + calculateSecondLargest.secondLargest(arrayD));

    }
}
