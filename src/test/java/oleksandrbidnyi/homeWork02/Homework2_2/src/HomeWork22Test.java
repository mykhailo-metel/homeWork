package oleksandrbidnyi.homeWork02.Homework2_2.src;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Konstantin.Malov on 03.02.2017.
 */
public class HomeWork22Test {
    public final static int ACCOUNT_AMOUNT = 1000;
    private Account testAcaunt;
    public HomeWork22Test() {
        testAcaunt = new Account(ACCOUNT_AMOUNT);
    }

    @Test
    public void withdrawalMinusAmountShouldNotChange() {
        testAcaunt.withdrowal(-150);
        Assert.assertTrue(testAcaunt.getBalance() == ACCOUNT_AMOUNT);
    }
}
