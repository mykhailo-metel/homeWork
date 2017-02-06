package oleksandrbidnyi.homeWork02.Homework2_1.src;

public class ArrayCalc {

    public int sum(int array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Integer array is empty");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        return sum;
    }

    public double sum(double array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Double array is empty");
        }
        double sum = 0;
        for (double i : array) {

            sum += i;
        }
        return sum;
    }

    public int min(int array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Integer array is empty");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public double min(double array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Double array is empty");
        }
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Integer array is empty");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double max(double array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Double array is empty");
        }
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int maxPositive(int array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Integer array is empty");
        }
        int maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > maxPositive) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }

    public double maxPositive(double array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Double array is empty");
        }
        double maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] > maxPositive) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }

    public int multiplication(int array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Integer array is empty");
        }
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication *= array[i];
        }
        return multiplication;
    }

    public double multiplication(double array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Double array is empty");
        }
        double multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication *= array[i];
        }
        return multiplication;
    }

    public double modulus(int array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Integer array is empty");
        }
        double modulus = (double)array[0] % (double)array[array.length - 1];//вместо "9" я поставил последний эллемент массива, также произвел приведение в double, чтоб избежать ошибки с нулем
            return modulus;
    }

    public double modulus(double array[]) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Double array is empty");
        }
        double modulus = array[0] % array[array.length-1];//вместо "9" я поставил последний эллемент массива

        return modulus;
    }

    public int secondLargest(int[] array) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Integer array is empty");
        }
        int secondLargest = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) { //Ищем второе по величине значение
                secondLargest = max;
                max = array[i];
            }
            else if(array[i] > secondLargest){ //Если у нас в массиве значения одинаковые, надо проверить больше ли елемент чем secondLargest
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public double secondLargest(double[] array) {
        if (array.length == 0) { //производится проверка на пустоту, посредством исключения
            throw new IllegalArgumentException("Double array is empty");
        }
        double secondLargest = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];
            }
            else if(array[i] > secondLargest){ //Если у нас в массиве значения одинаковые, надо проверить больше ли елемент чем secondLargest
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

}


