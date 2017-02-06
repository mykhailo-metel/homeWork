
public class CalculateMultiplication {
    public static void main(String[] args) {
        int arrayI[] = {10, 22, 24, 66, -10, -22, -14, 33, 26, 10};
        double arrayD[] = {10.5, 22.5, 24.5, 66.5, -10.5, -22.5, 14.5, 33.5, 26.5, 10.5};
        multiplication(arrayI);
        multiplication(arrayD);
    }
    public static int multiplication(int array[]){
        int mult = 1;
        if (mult == 0){
            System.out.println("The multiplication result of array 1 = 0 ");
        }else{
            for(int i=0; i<array.length; i++){
                mult = mult * array[i];
            }
            System.out.println("The multiplication result of array 1 = " + mult);
        }
        return mult;
    }
    public static double multiplication(double array[]){
        double mult = 1;
        if (mult==0){
            System.out.println("The multiplication result of array 2 = 0 ");
        }else{
            for(int i=0; i<array.length; i++){
                mult = mult * array[i];
            }
            System.out.println("The multiplication result of array 2 = " + mult);
        }
        return mult;
    }
}
