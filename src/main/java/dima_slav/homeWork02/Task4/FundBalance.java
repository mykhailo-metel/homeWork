package dima_slav.homeWork02.Task4;

import java.util.Arrays;

public class FundBalance {
    private int[] balances;
    private String[] ownerNames;

    public FundBalance(int[] balances, String[] ownerNames) {
        this.balances = balances;
        this.ownerNames = ownerNames;
    }

    public int[] getBalances() {
        return balances;
    }

    public void setBalances(int[] balances) {
        this.balances = balances;
    }

    public String[] getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(String[] ownerNames) {
        this.ownerNames = ownerNames;
    }

    public void fund(int sumOfFunding, String ownerName) {
        int index = Arrays.asList(ownerNames).indexOf(ownerName);
        if (index < 0) {
            System.out.println("Such account name does not exist.");
        }
        if (sumOfFunding < 0) {// проверка на валидность.
            System.out.println("Invalid value");
        }

        int balance;
        balance = balances[index]; // переводим пременную balance в локальные переменные.
        int result = balance + sumOfFunding;
        System.out.println(ownerName + " Balance after funding = " + result);
        balances[index] = balance;
    }
}
