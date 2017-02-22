package homeWork04;

import java.util.*;

/*
 USBank: limit of withdrawal = 1000 if currency is
 USD and 1200 if currency is EUR
 limit of funding - 10000 if EUR and no limit if USD
 monthly rate - 1% with USD and 2% with EUR
 commision - 5% if USD and up to 1000, 7% if USD and more than 1000
 6% if EUR and up to 1000 and 8% if EUR and more than 1000

 EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
 limit of funding - 20000 if EUR and 10000 if USD
 monthly rate - 0% with USD and 1% with EUR
 commision - 5% if USD and up to 1000, 7% if USD and more than 1000
 2% if EUR and up to 1000 and 4% if EUR and more than 1000

 ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR

 limit of funding - 5000 if EUR and 10000 if USD
 monthly rate - 1% with USD and 0% with EUR
 commision - 3% if USD and up to 1000, 5% if USD and more than 1000
 10% if EUR and up to 1000 and 11% if EUR and more than 1000
*/


public class Main
{
    public static void main(String[] args){
        User usUser1 = new User();
        User usUser2 = new User();

    }
}

enum Currency{USD, EURO
};

abstract class Bank {
    long id;
    String bankCountry;
    Currency currency;
    int numberOfEmployees;
    double avrSalaryOfEmployee;
    long rating;
    long totalCapital;

    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary(){
        System.out.println("moneyPaidMonthlyForSalary");
        return 1;
    }
}

class USBank extends Bank{
    int limitOfWithdrawUsd = 1000;
    int limitOfWithdrawEur = 1200;

    int limitOfFundingEur = 1200;
    int limitOfFundingUsd = 0;

    int monthlyRateUsd = 1;
    int monthlyRateEur = 2;

    int commisionUsdBelow1000 = 5;
    int commisionUsdAbove1000 = 7;

    int commisionEurBelow1000 = 6;
    int commisionEurAbove1000 = 8;

    @Override
    int getCommission(int summ)
    {
        int commissionAmount = 0;

        if (summ < 0) {
            throw new RuntimeException();
        }
        else if (currency == currency.EURO){
            commissionAmount = (summ * ( (summ <= 1000)?commisionEurBelow1000:commisionEurAbove1000))/100;
        }
        else if (currency == currency.USD) {
            commissionAmount = (summ * ( (summ <= 1000)?commisionUsdBelow1000:commisionUsdAbove1000))/100;
        }
        return commissionAmount;
    }

    @Override
    int getLimitOfWithdrawal()
    {
        if (currency == currency.EURO){
            return limitOfWithdrawEur;
        }
        else if (currency == currency.USD) {
            return limitOfWithdrawUsd;
        }

        return 0;
    }

    @Override
    int getMonthlyRate()
    {
        if (currency == currency.EURO){
            return monthlyRateEur;
        }
        else /*if (currency == currency.USD)*/ {
            return monthlyRateUsd;
        }
    }

    @Override
    int getLimitOfFunding()
    {
        if (currency == currency.EURO){
            return limitOfFundingEur;
        }
        else /*if (currency == currency.USD)*/ {
            return limitOfFundingUsd;
        }
    }
}


class EUBank extends Bank{
    int limitOfWithdrawUsd = 2000;
    int limitOfWithdrawEur = 2200;

    int limitOfFundingEur = 20000;
    int limitOfFundingUsd = 10000;

    int monthlyRateUsd = 0;
    int monthlyRateEur = 1;

    int commisionUsdBelow1000 = 5;
    int commisionUsdAbove1000 = 7;

    int commisionEurBelow1000 = 2;
    int commisionEurAbove1000 = 4;

    @Override
    int getCommission(int summ)
    {
        int commissionAmount = 0;

        if (summ < 0) {
            throw new RuntimeException();
        }
        else if (currency == currency.EURO){
            commissionAmount = (summ * ( (summ <= 1000)?commisionEurBelow1000:commisionEurAbove1000))/100;
        }
        else if (currency == currency.USD) {
            commissionAmount = (summ * ( (summ <= 1000)?commisionUsdBelow1000:commisionUsdAbove1000))/100;
        }
        return commissionAmount;
    }

    @Override
    int getLimitOfWithdrawal()
    {
        if (currency == currency.EURO){
            return limitOfWithdrawEur;
        }
        else if (currency == currency.USD) {
            return limitOfWithdrawUsd;
        }

        return 0;
    }

    @Override
    int getMonthlyRate()
    {
        if (currency == currency.EURO){
            return monthlyRateEur;
        }
        else /*if (currency == currency.USD)*/ {
            return monthlyRateUsd;
        }
    }

    @Override
    int getLimitOfFunding()
    {
        if (currency == currency.EURO){
            return limitOfFundingEur;
        }
        else /*if (currency == currency.USD)*/ {
            return limitOfFundingUsd;
        }
    }
}


class ChinaBank extends Bank{
    int limitOfWithdrawUsd = 100;
    int limitOfWithdrawEur = 150;

    int limitOfFundingEur = 5000;
    int limitOfFundingUsd = 10000;

    int monthlyRateUsd = 1;
    int monthlyRateEur = 0;

    int commisionUsdBelow1000 = 3;
    int commisionUsdAbove1000 = 5;

    int commisionEurBelow1000 = 10;
    int commisionEurAbove1000 = 11;

    @Override
    int getCommission(int summ)
    {
        int commissionAmount = 0;

        if (summ < 0) {
            throw new RuntimeException();
        }
        else if (currency == currency.EURO){
            commissionAmount = (summ * ( (summ <= 1000)?commisionEurBelow1000:commisionEurAbove1000))/100;
        }
        else if (currency == currency.USD) {
            commissionAmount = (summ * ( (summ <= 1000)?commisionUsdBelow1000:commisionUsdAbove1000))/100;
        }
        return commissionAmount;
    }

    @Override
    int getLimitOfWithdrawal()
    {
        if (currency == currency.EURO){
            return limitOfWithdrawEur;
        }
        else if (currency == currency.USD) {
            return limitOfWithdrawUsd;
        }

        return 0;
    }

    @Override
    int getMonthlyRate()
    {
        if (currency == currency.EURO){
            return monthlyRateEur;
        }
        else /*if (currency == currency.USD)*/ {
            return monthlyRateUsd;
        }
    }

    @Override
    int getLimitOfFunding()
    {
        if (currency == currency.EURO){
            return limitOfFundingEur;
        }
        else /*if (currency == currency.USD)*/ {
            return limitOfFundingUsd;
        }
    }
}


class  User{
    long id;
    String name;
    double balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    Bank bank;

    @Override
    public String toString()
    {
        // TODO: Implement this method
        return super.toString();
    }


}

interface BankSystem{
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}

class BankSystemImpl implements BankSystem
{

    @Override
    public void withdrawOfUser(User user, int amount)
    {
        int commission;
        commission = user.bank.getCommission(amount);

        if ( (amount >= 0) && (user.balance >= commission + amount) && (amount <= user.bank.getLimitOfWithdrawal() ) ) {
            user.balance -= (amount + commission);
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount)
    {
        /*int commissionFrom;
        int commissionTo;

        commissionFrom = userFrom.bank.getCommission(amount);


        if ( (amount >= 0) && (user.balance >= commission + amount) && (amount <= user.bank.getLimitOfWithdrawal() ) ) {
            user.balance -= (amount + commission);
        }*/

    }

    @Override
    public void fundUser(User user, int amount)
    {
        // TODO: Implement this method
    }

    @Override
    public void paySalary(User user)
    {
        // TODO: Implement this method
    }

}
