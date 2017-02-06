package oleksandrbidnyi.homeWork02.Homework2_1.src;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Konstantin.Malov on 03.02.2017.
 */
public class HomeWork21Test {
    private ArrayCalc arrayCalc;
    public HomeWork21Test() {
        arrayCalc = new ArrayCalc();
    }

    @Test
    public void secondLargestTestWhenLargestAndSecondLargestTheSame() {
        double expectedValue = 10.1;
        double[] testArray = {9, 8 , 1, 0, -1, 10.1 ,10.1, 1, 2, 3};
        Assert.assertTrue(Double.compare(arrayCalc.secondLargest(testArray), expectedValue) == 0);
    }

    @Test
    public void modulusWhenArrayLenghtMoreOrLessThenTen() {
        double[] testArray = {1, 8 , 1};
        arrayCalc.modulus(testArray);
    }

}
