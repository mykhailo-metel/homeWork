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
            if (Long.MAX_VALUE - result < elt) { //Нужно удостовериться, что сумма не выйдет за пределы long
                throw new IllegalArgumentException("Sum is out of Long bounds!");
            } else //Если выйдет, бросить исключение
            {
                result += elt;
            }
        }
        return result;
    }

    public double sum(double[] array) {
        double result = 0;
        for (double elt : array) {
            if (Double.MAX_VALUE - result < elt) { //Нужно удостовериться, что сумма не выйдет за пределы double
                throw new IllegalArgumentException("Sum is out of Double bounds!");
            } else //Если выйдет, бросить исключение
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
        if (array.length == 0) { //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        int result = array[0]; //первый элемент массива - первый кандидат в минимальные значения
        for (int i = 0; i < array.length; i++) { //не хотел писать првоерку длины массива, решил, что двойная проверка первого
                                                //элемента - меньшее зло.
            if (array[i] < result) {
                result = array[i]; //присваиваем result значение array[i], если array[i]<result
            }
        }
        return result;
    }

    public double min(double[] array) {
        if (array.length == 0) { //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        double result = array[0]; //первый элемент массива - первый кандидат в минимальные значения
        for (int i = 0; i < array.length; i++) { //не хотел писать првоерку длины массива, решил, что двойная проверка первого
            //элемента - меньшее зло.
            if (array[i] < result) {
                result = array[i]; //присваиваем result значение array[i], если array[i]<result
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
        if (array.length == 0) { //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        int result = array[0]; //первый элемент массива - первый кандидат в максимальные значения
        for (int i = 0; i < array.length; i++) { //не хотел писать првоерку длины массива, решил, что двойная проверка первого
            //элемента - меньшее зло.
            if (array[i] > result) {
                result = array[i]; //присваиваем result значение array[i], если array[i]>result
            }
        }
        return result;
    }

    public double max(double[] array) {
        if (array.length == 0) { //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        double result = array[0]; //первый элемент массива - первый кандидат в максимальные значения
        for (int i = 0; i < array.length; i++) { //не хотел писать првоерку длины массива, решил, что двойная проверка первого
            //элемента - меньшее зло.
            if (array[i] > result) {
                result = array[i]; //присваиваем result значение array[i], если array[i]>result
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
        if (array.length == 0) { //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        int result = 0;//первое значение - 0. Гарантирует поиск только позитивных значений
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i]; //присваиваем result значение array[i], если array[i]>result
            }
        }
        return result;
    }

    public double maxPositive(double[] array) {
        if (array.length == 0) { //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        double result = 0;//первое значение - 0. Гарантирует поиск только позитивных значений
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i]; //присваиваем result значение array[i], если array[i]>result
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
        if (array.length == 0) { //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        long result=1;
        for (int elt : array) {
            if(Long.MAX_VALUE/elt<result){ //Если произведение > предельного значения long, бросаем исключение
                throw new IllegalArgumentException("Sum is out of Long bounds!");
            }
            result*=elt;
        }
        return result;
    }

    public double multiplication(double[] array) {
        if (array.length == 0) { //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }
        long result=1;
        for (double elt : array) {
            if(Long.MAX_VALUE/elt<result){ //Если произведение > предельного значения long, бросаем исключение
                throw new IllegalArgumentException("Sum is out of Long bounds!");
            }
            result*=elt;
        }
        return result;
    }

    //MODULUS
    public double modulus(int[] array) {
        if(array.length==0){ //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
        }

        return (double)((double)array[0]%(double)array[array.length-1]);//cast to double to avoid Division by zero error
    }

    public double modulus(double[] array) {
        if(array.length==0){ //Если массив пустой - бросаем исключение.
            throw new IllegalArgumentException("The array is empty");
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
        int second_largest = array[0]; //сначала инициализируем обе переменных значением первого элемента массива
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) { //если элемент массива > largest, присваиваем second_largest=largest
                second_largest=largest; // и largest =  элемент массива
                largest = array[i];
            }
            else if(array[i] > second_largest){ //иначе проверяем больше ли элемент, чем second_largest
                second_largest = array[i];
            }
        }
        return second_largest;
    }

    public double secondLargest(double[] array) {
        if (array.length <= 1) { //Если длина массива меньше 2, у него не может быть второго максимального значения.
            throw new IllegalArgumentException("The array length < 2");
        }
        double largest = array[0];
        double second_largest = array[0]; //сначала инициализируем обе переменных значением первого элемента массива
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) { //если элемент массива > largest, присваиваем second_largest=largest
                second_largest=largest; // и largest =  элемент массива
                largest = array[i];
            }
            else if(array[i] > second_largest){ //иначе проверяем больше ли элемент, чем second_largest
                second_largest= array[i];
            }
        }
        return second_largest;
    }


}
