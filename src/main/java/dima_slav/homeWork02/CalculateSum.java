package Task2_1;

public class CalculateSum {
    public static void main(String[] args) {
        int arrayI[] = {10, 22, 24, 66, -10, -22, -14, 33, 26, 10};
        double arrayD[] = {10.5, 22.5, 24.5, 66.5,  -10.5,  -22.5,  -14.5, 33.5, 26.5, 10.5};
        sum(arrayI);
        sum(arrayD);
    }

    public static int sum(int array[]){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }

        System.out.println("The sum of array 1 =" +sum);
        return sum;
    }

    public static double sum(double array[]){
        double sum = 0.0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        
        System.out.println("The sum of array 2 =" + sum);
        return sum;
    }
}
