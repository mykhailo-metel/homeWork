package dima_slav.homeWork02.Task3;

import java.util.Arrays;

public class AccountOwner {
    private double commission = 0.05;
    private double[] balances;
    private String[] ownerNames;

    public AccountOwner(double[] balances, String[] ownerNames) {
        this.balances = balances;
        this.ownerNames = ownerNames;
    }

    public double[] getBalances() {
        return balances;
    }

    public void setBalances(double[] balances) {
        this.balances = balances;
    }

    public String[] getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(String[] ownerNames) {
        this.ownerNames = ownerNames;
    }

    public void withdrawal(double sumOfWithdrawal, String ownerName){
        int index = Arrays.asList(ownerNames).indexOf(ownerName);

        if(index<0){
            System.out.println("There is no such account name");
            return;
        }

        double balance;
        balance = balances[index]; //переводим переменную balance в локадьные переменные
        if (sumOfWithdrawal <= 0) { //проверка на валидность
            System.out.println("Invalid value");
        }
        double result = balance - sumOfWithdrawal -(sumOfWithdrawal * commission);
        if (result >=0){
            System.out.println(ownerName+" sum of withdrawal = " +sumOfWithdrawal+ " balance after withdrawal = " +result);
            balances[index] = balance;
        }else{
            System.out.println("NO");
        }
    }
}
