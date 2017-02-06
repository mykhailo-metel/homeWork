package oleksandrbidnyi.homeWork02.Homework2_4.src;

import java.util.Arrays;

public class Account {
    private double balance;
    private double[] balances;
    private String[] ownerNames;

    public Account(double[]balances,String [] ownerNames){
        this.balances=balances;
        this.ownerNames=ownerNames;
    }

    public void fund(double moneyYouWantToFund, String ownerName){
        int index = Arrays.asList(ownerNames).indexOf(ownerName);
        if(index<0){
            System.out.println("There is no such account name");
            return;
        }
        if(moneyYouWantToFund>0){
            balance = balances[index];
            balance=balance+moneyYouWantToFund;
            System.out.println(ownerName + " balance after funding: " +balance);
            balances[index] = balance;
        }else {
            System.out.println("Incorrect sum");
        }
    }

    }




