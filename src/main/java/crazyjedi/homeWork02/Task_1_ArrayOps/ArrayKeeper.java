package homeWork02.Task_1_ArrayOps;

/**
 * Created by Vlad on 05.02.2017.
 */
public class ArrayKeeper {
    //SUM
    /*
    Функция суммирует элементы массива. Если сумма получается слишком большой, бросает исключение.
     */
    public long sum(int[] array) {
        long result = 0;
        for (int elt : array) {
            if (Long.MAX_VALUE - result < elt) {
                throw new IllegalArgumentException("Sum is out of Long bounds!");
            } else
            {
                result += elt;
            }
        }
        return result;
    }

    public double sum(double[] array) {
        double result = 0;
        for (double elt : array) {
            if (Double.MAX_VALUE - result < elt) {
                throw new IllegalArgumentException("Sum is out of Double bounds!");
            } else
            {
                result += elt;
            }
        }
        return result;
    }

    //MIN
    /*
    Функция ищет минимальное значение. Если массив пустой, бросает исключение. Я бы предпочел, чтобы это было не так и
    метод возвращал null, но не вижу другого способа показать, что введен неверный аргумент.
     */
    public int min(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    public double min(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    //MAX
    /*
    Функция ищет максимальное значение. Если массив пустой, бросает исключение. Я бы предпочел, чтобы это было не так и
    метод возвращал null, но не вижу другого способа показать, что введен неверный аргумент.
     */
    public int max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    public double max(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    //MAX_POSITIVE
    /*
    Функция ищет максимальное положительное значение. Если массив пустой, бросает исключение. Я бы предпочел, чтобы это было не так и
    метод возвращал null, но не вижу другого способа показать, что введен неверный аргумент.
     */
    public int maxPositive(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    public double maxPositive(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    //MULTIPLICATION
    /*
    Функция перемножает элементы массива. Если массив пустой или произведение невозможно вместить в long (double)
    , бросает исключение.
     */
    public long multiplication(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        long result=1;
        for (int elt : array) {
            if(Long.MAX_VALUE/elt<result){
                throw new IllegalArgumentException("Sum is out of Long bounds!");
            }
            result*=elt;
        }
        return result;
    }

    public double multiplication(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty");
        }
        long result=1;
        for (double elt : array) {
            if(Long.MAX_VALUE/elt<result){
                throw new IllegalArgumentException("Sum is out of Long bounds!");
            }
            result*=elt;
        }
        return result;
    }

    //MODULUS
    public int modulus(int[] array) {
        if(array.length==0){
            throw new IllegalArgumentException("The array is empty");
        }
        if(array[array.length-1]==0){
            throw new IllegalArgumentException("Devision by zero.");
        }
        return array[0]%array[array.length-1];
    }

    public double modulus(double[] array) {
        if(array.length==0){ //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        if(array[array.length-1]==0){
            throw new IllegalArgumentException("Devision by zero.");
        }
        return array[0]%array[array.length-1];
    }

    //SECOND_LARGEST
    /*
    Функция ищет максимальное значение. Если массив пустой, бросает исключение. Я бы предпочел, чтобы это было не так и
    метод возвращал null, но не вижу другого способа показать, что введен неверный аргумент.
     */
    public int secondLargest(int[] array) {
        if (array.length <= 1) { //Если длина массива меньше 2, у него не может быть второго максимального значения.
            throw new IllegalArgumentException("The array length < 2");
        }
        int largest = array[0];
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest=largest;
                largest = array[i];
            }
            else if(array[i] > secondLargest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public double secondLargest(double[] array) {
        if (array.length <= 1) { //Если длина массива меньше 2, у него не может быть второго максимального значения.
            throw new IllegalArgumentException("The array length < 2");
        }
        double largest = array[0];
        double secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest=largest;
                largest = array[i];
            }
            else if(array[i] > secondLargest){
                secondLargest= array[i];
            }
        }
        return secondLargest;
    }


}
