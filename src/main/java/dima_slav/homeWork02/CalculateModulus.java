
public class CalculateModulus {
    public static void main(String[] args) {
        int arrayI[] = {76, 81, 48, 36, 25, 20, 15, 8, 4, 6};
        double arrayD[] = {76.5, 81.5, 48.5, 36.5, 25.5, 20.5, 15.5, 8.5, 4.5, 6.5};
        modulus(arrayI);
        modulus(arrayD);
    }

    public static int modulus(int array[]){
        int a = array[0];
        int b = array[array.length - 1];
        int result = a % b;
        System.out.println("The modulus result of array 1 = " + result);
        return result;
    }

    public static double modulus(double array[]){
        double x = array[0];
        double y = array[array.length - 1];
        double result = x % y;
        System.out.println("The modulus result of array 2 = " + result);
        return result;

    }
}
