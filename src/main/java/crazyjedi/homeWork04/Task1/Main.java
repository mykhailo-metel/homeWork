package crazyjedi.homeWork04.Task1;

import java.math.BigDecimal;

/**
 * Created by Vlad on 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        TariffsModel usBankTariffs = new TariffsModel(1000, 1200, -1
                , 1, 10000, 2, 1000
                , "0.05", "0.07", "0.06", "0.08");
        TariffsModel euBankTariffs = new TariffsModel(2000, 2200, 10000
                , 0, 20000, 1, 1000
                , "0.05", "0.07", "0.02", "0.04");
        TariffsModel chinaBankTariffs = new TariffsModel(100, 150, 10000
                , 1, 5000, 0, 1000
                , "0.03", "0.05", "0.1", "0.11");

        Bank usBankUSD = new Bank(1,"US",Bank.Currency.USD,500
                ,new BigDecimal("5000.00"),10,new BigDecimal("10000"),usBankTariffs);


        Bank usBankEUR = new Bank(2,"US",Bank.Currency.EUR,500
                ,new BigDecimal("5000.00"),10,new BigDecimal("10000"),usBankTariffs);

        Bank euBankUSD = new Bank(3,"EU",Bank.Currency.USD,500
                ,new BigDecimal("5000.00"),10,new BigDecimal("10000"),euBankTariffs);

        Bank euBankEUR = new Bank(4,"EU",Bank.Currency.EUR,500
                ,new BigDecimal("5000.00"),10,new BigDecimal("10000"),euBankTariffs);

        Bank chinaBankUSD = new Bank(5,"China",Bank.Currency.USD,500
                ,new BigDecimal("5000.00"),10,new BigDecimal("10000"),chinaBankTariffs);

        Bank chinaBankEUR = new Bank(6,"China",Bank.Currency.EUR,500
                ,new BigDecimal("5000.00"),10,new BigDecimal("10000"),chinaBankTariffs);


        User userUSBankUSD = new User(1, "John", new BigDecimal(5000), 10, "MSFT"
                , new BigDecimal(1250), usBankUSD);

        User userUSBankEUR = new User(1, "John", new BigDecimal(7000), 10, "MSFT"
                , new BigDecimal(1300), usBankEUR);
        User userEUBankUSD = new User(1, "John", new BigDecimal(6000), 10, "MSFT"
                , new BigDecimal(1800), euBankUSD);
        User userEUBankEUR = new User(1, "John", new BigDecimal(4000), 10, "MSFT"
                , new BigDecimal(1500), euBankEUR);
        User userChinaBankUSD = new User(1, "John", new BigDecimal(2000), 10, "MSFT"
                , new BigDecimal(800), chinaBankUSD);
        User userChinaBankEUR = new User(1, "John", new BigDecimal(1500), 10, "MSFT"
                , new BigDecimal(500), chinaBankEUR);
//
        MyBankSystem BankSystem = new MyBankSystem(new BigDecimal("1.1"));
//
        System.out.println(userUSBankUSD);
        System.out.println("*****");
        System.out.println(userUSBankEUR);
        System.out.println("\n");
        System.out.println("Withdrawing");
        System.out.println("Withdraw 500 from userUSBankUSD");
        BankSystem.withdrawOfUser(userUSBankUSD, 500);
        System.out.println("\n");
        System.out.println(userUSBankUSD);
        System.out.println("\n");
        System.out.println("Withdraw 1500 from userUSBankEUR");
        try {
            BankSystem.withdrawOfUser(userUSBankEUR, 1500);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        BankSystem.withdrawOfUser(userUSBankEUR, 1100);
        System.out.println("\n");
        System.out.println(userUSBankEUR);
        System.out.println("\n");
        System.out.println("Salary");
        BankSystem.paySalary(userChinaBankUSD);
        System.out.println(userChinaBankUSD);
        System.out.println("\n");
        System.out.println("Funding");
        System.out.println("\n");
        BankSystem.fundUser(userChinaBankEUR, 5000);
        System.out.println(userChinaBankEUR);
        System.out.println("\n");
        System.out.println("Transfer");
        System.out.println("\n");
        BankSystem.transferMoney(userEUBankUSD, userEUBankEUR, 1000);
        System.out.println("\n");
        System.out.println(userEUBankUSD);
        System.out.println("\n");
        System.out.println(userEUBankEUR);
    }
}
