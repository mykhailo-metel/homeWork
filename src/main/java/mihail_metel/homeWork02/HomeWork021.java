package homeWork02;



public class HomeWork021 {
//            •	sum(int array[]), sum(double[])
//            •	min(int array[]), min(double[])
//            •	max(int array[]), max(double[])
//            •	maxPositive(int array[]), maxPositive(double array[]),
//            •	multiplication  (int array[]), multiplication (double[])
//            •	modulus(int array[]), modulus(double[])
//            •	secondLargest(int array[]), secondLargest(double[])
private int[] myIntArray;
private double[] myDoubleArray;

    public static void main(String[] args) {
        HomeWork021 arrAct = new HomeWork021();

        arrAct.setMyIntArray(new int[]{//1,1,2,2});/*
                15,
                6,
                10,
                125,
                358,
                3258,
                1,
                3258,
                -125,
                10});

        arrAct.setMyDoubleArray(new double[]{
                10,2,
                6.5,
                1.2,
                250.365,
                3258.1,
                1.11,
                1.33,
                3258.1,
                -125,
                4});

        for (int i = 0; i < arrAct.getMyIntArray().length; i++) {
            System.out.println(arrAct.getMyIntArray()[i]);
        }

        System.out.println("Инты: ");
        System.out.println("Сумма масива: " + arrAct.sum(arrAct.getMyIntArray()));
        System.out.println("Минимальное значение массива: " + arrAct.min(arrAct.getMyIntArray()));
        System.out.println("Максимальное значение массива: " + arrAct.max(arrAct.getMyIntArray()));
        System.out.println("Максимальное положительное значение массива: " + arrAct.maxPositive(arrAct.getMyIntArray()));
        System.out.println("Результат перемножения массива: " + arrAct.multiplication(arrAct.getMyIntArray()));
        System.out.println("Остаток от деления первого элемента массива на последний: "
                + arrAct.modulus(arrAct.getMyIntArray()));
        System.out.println("Второе по величине число массива: " + arrAct.secondLargest(arrAct.getMyIntArray()));

        System.out.println("\nДаблы: ");

        for (int i = 0; i < arrAct.getMyIntArray().length; i++) {
            System.out.println(arrAct.getMyDoubleArray()[i]);
        }

        System.out.println("Сумма масива: " + arrAct.sum(arrAct.getMyDoubleArray()));
        System.out.println("Минимальное значение массива: " + arrAct.min(arrAct.getMyDoubleArray()));
        System.out.println("Максимальное значение массива: " + arrAct.max(arrAct.getMyDoubleArray()));
        System.out.println("Максимальное положительное значение массива: " + arrAct.maxPositive(arrAct.getMyDoubleArray()));
        System.out.println("Результат перемножения массива: " + arrAct.multiplication(arrAct.getMyDoubleArray()));
        System.out.println("Остаток от деления первого элемента массива на последний: "
                + arrAct.modulus(arrAct.getMyDoubleArray()));
        System.out.println("Второе по величине число массива: " + arrAct.secondLargest(arrAct.getMyDoubleArray()));

    }

    // Геттеры и сеттеры
    public int[] getMyIntArray() {
        return myIntArray;
    }

    public void setMyIntArray(int[] myIntArray) {
        this.myIntArray = myIntArray;
    }

    public double[] getMyDoubleArray() {
        return myDoubleArray;
    }

    public void setMyDoubleArray(double[] myDoubleArray) {
        this.myDoubleArray = myDoubleArray;
    }

    // Methods with integer arrays
    public int sum(int array[]){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        int sum=0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public int min(int array[]){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        int minimum=array[0];

        for (int i = 0; i < array.length; i++) {
            if ( minimum > array[i] ){
                minimum = array[i];
            }
        }

        return minimum;
    }

    public int max(int array[]){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        int maximum=array[0];

        for (int i = 0; i < array.length; i++) {

            if( maximum < array[i] ){
                maximum = array[i];
            }

        }

        return maximum;
    }

    public int maxPositive(int array[]){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        int max_positive = 0;

        for (int i = 0; i < array.length; i++) {

            if(max_positive < array[i] && array[i] >= 0 ){
                max_positive = array[i];
            }

        }

        return max_positive;
    }

    public int multiplication(int array[]){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        int multip = 1;

        for (int i = 0; i < array.length; i++) {
            multip *= array[i];
        }

        return multip;
    }

    public int modulus(int array[]){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        return array[0] % array[array.length - 1];

    }

    public int secondLargest(int array[]){

        if (array == null){        // проверка на пустоту массива
            return 0;
        }

            int firstMax = array[0];
            int secondMax = array[0];

        for (int i = 0; i < array.length; i++) {

            if ( firstMax < array[i] ){
                firstMax = array[i];
            }
            else if(secondMax < array[i] ){
                secondMax = array[i];
            }

        }

        return secondMax;
    }

    //Methods with double arrays
    public double sum(double[] array){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        double sum=0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public double min(double[] array){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        double minimum=array[0];

        for (int i = 0; i < array.length; i++) {
            if ( minimum > array[i] ){
                minimum = array[i];
            }
        }

        return minimum;
    }

    public double max(double[] array){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        double maximum=array[0];

        for (int i = 0; i < array.length; i++) {

            if( maximum < array[i] ){
                maximum = array[i];
            }

        }

        return maximum;
    }

    public double maxPositive(double[] array){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        double max_positive = 0;

        for (int i = 0; i < array.length; i++) {

            if(max_positive < array[i] && array[i] >= 0 ){
                max_positive = array[i];
            }

        }

        return max_positive;
    }

    public double multiplication(double[] array){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        double multip = 1;

        for (int i = 0; i < array.length; i++) {
            multip *= array[i];
        }

        return multip;
    }

    public double modulus(double[] array){

        if(array == null){        // проверка на пустоту массива
            return 0;
        }

        return array[0] % array[array.length - 1];

    }

    public double secondLargest(double[] array){

        if (array == null){        // проверка на пустоту массива
            return 0;
        }

        double firstMax = array[0];
        double secondMax = array[0];

        for (int i = 0; i < array.length; i++) {

            if ( firstMax < array[i] ){
                firstMax = array[i];
            }
            else if(secondMax < array[i] ){
                secondMax = array[i];
            }

        }

        return secondMax;
    }

}
