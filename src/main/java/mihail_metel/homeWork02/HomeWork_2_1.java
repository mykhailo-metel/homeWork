package homeWork02;



public class HomeWork_2_1 {
//            •	sum(int array[]), sum(double[])
//            •	min(int array[]), min(double[])
//            •	max(int array[]), max(double[])
//            •	maxPositive(int array[]), maxPositive(double array[]),
//            •	multiplication  (int array[]), multiplication (double[])
//            •	modulus(int array[]), modulus(double[])
//            •	secondLargest(int array[]), secondLargest(double[])
    public int[] myIntArray;

    public void arrayPrint(int[] array){

        System.out.println("Элементы массива длинной " + array.length + " :" );

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public int sum(int array[]){

        int sum=0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public int min(int array[]){

        int minimum=array[0];

        for (int i = 0; i < array.length; i++) {
            if ( minimum > array[i] ){
                minimum = array[i];
            }
        }

        return minimum;
    }

    public int max(int array[]){

        int maximum=array[0];

        for (int i = 0; i < array.length; i++) {

            if( maximum < array[i] ){
                maximum = array[i];
            }

        }

        return maximum;
    }

    public int maxPositive(int array[]){

        int max_positive = 0;

        for (int i = 0; i < array.length; i++) {

            if(max_positive < array[i] && array[i] >= 0 ){
                max_positive = array[i];
            }

        }

        return max_positive;
    }

    public int multiplication(int array[]){

        int multip = 1;

        for (int i = 0; i < array.length; i++) {
            multip *= array[i];
        }

        return multip;
    }

    public int modulus(int array[]){

        return array[0] % array[array.length - 1];

    }

    public int secondLargest(int array[]){

            int firstMax = array[0];
            int secondMax = array[0];

        for (int i = 0; i < array.length; i++) {

            if ( firstMax < array[i] ){
                secondMax = firstMax;
                firstMax = array[i];
            }

        }

        return secondMax;
    }
    
    public static void main(String[] args) {
        HomeWork_2_1 arrAct = new HomeWork_2_1();

        arrAct.myIntArray = new int[]{
                15,
                6,
                10,
                125,
                358,
                55,
                1,
                3258,
                -125,
                10};

        arrAct.arrayPrint(arrAct.myIntArray);
        System.out.println("Сумма масива: " + arrAct.sum(arrAct.myIntArray));
        System.out.println("Минимальное значение массива: " + arrAct.min(arrAct.myIntArray));
        System.out.println("Максимальное значение массива: " + arrAct.max(arrAct.myIntArray));
        System.out.println("Максимальное положительное значение массива: " + arrAct.maxPositive(arrAct.myIntArray));
        System.out.println("Результат перемножения массива: " + arrAct.multiplication(arrAct.myIntArray));
        System.out.println("Остаток от деления первого элемента массива на последний: "
                + arrAct.modulus(arrAct.myIntArray));
        System.out.println("Второе по величине число массива: " + arrAct.secondLargest(arrAct.myIntArray));

    }
}
