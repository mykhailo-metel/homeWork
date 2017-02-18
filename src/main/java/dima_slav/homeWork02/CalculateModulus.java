package Task2_1;

public class CalculateModulus {

    public  int modulus(int array[]){
        if (array.length == 0) {
            throw new IllegalArgumentException("The array 1 is empty");
        }
            if (array[array.length - 1] == 0){
                throw new IllegalArgumentException("Invalid value of last element of array 1 ");
            }

        int a = array[0];
        int b = array[array.length - 1];
        int result = a % b;
        return result;
    }


    public double modulus(double array[]){
        if (array.length == 0){
            throw new IllegalArgumentException("The array 2 is empty");
        }
        if (array[array.length - 1] == 0){
            throw new IllegalArgumentException("Invalid value of the last element of array 2");
        }

        double x = array[0];
        double y = array[array.length - 1];
        double result = x % y;
        return result;

    }
}
