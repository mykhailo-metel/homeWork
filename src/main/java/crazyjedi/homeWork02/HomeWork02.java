package crazyjedi.homeWork02;

import homeWork02.Bank_Tasks_2_4.Bank;
import homeWork02.Task_1_ArrayOps.ArrayKeeper;

/**
 * Created by Konstantin.Malov on 30.01.2017.
 */
public class HomeWork02 {
    public static void main(String[] args) {
        int[] test_array_i = {1,2,4,6,5,7,4};
        double[] test_array_d = {1d,2d,4d,6d,5d,7d,4d};
        ArrayKeeper arKeeper = new ArrayKeeper();
        System.out.println("\nINT\n");
        System.out.println(arKeeper.sum(test_array_i));
        System.out.println(arKeeper.min(test_array_i));
        System.out.println(arKeeper.max(test_array_i));
        System.out.println(arKeeper.maxPositive(test_array_i));
        System.out.println(arKeeper.multiplication(test_array_i));
        System.out.println(arKeeper.modulus(test_array_i));
        System.out.println(arKeeper.secondLargest(test_array_i));
        System.out.println("\nDOUBLE\n");
        System.out.println(arKeeper.sum(test_array_d));
        System.out.println(arKeeper.min(test_array_d));
        System.out.println(arKeeper.max(test_array_d));
        System.out.println(arKeeper.maxPositive(test_array_d));
        System.out.println(arKeeper.multiplication(test_array_d));
        System.out.println(arKeeper.modulus(test_array_d));
        System.out.println(arKeeper.secondLargest(test_array_d));


        Bank.withdraw(1000,100);

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        Bank.withdrawFromOneOfArray(balances,ownerNames,"Oww",490);
        Bank.withdrawFromOneOfArray(balances,ownerNames,"Ann",100);
        Bank.fundOneOfArray(balances,ownerNames,"Oww",100);
    }
}
