package crazyjedi.homeWork04.Task1;

/**
 * Created by Vlad on 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        USBank usBankUSD = new USBank(1, "US", Bank.Currency.USD, 200,
                1000, 10, 100000);
        USBank usBankEUR = new USBank(2, "US", Bank.Currency.EUR, 200,
                1000, 8, 100000);
        EUBank euBankUSD = new EUBank(3, "EU", Bank.Currency.USD, 200,
                1000, 10, 100000);
        EUBank euBankEUR = new EUBank(4, "EU", Bank.Currency.EUR, 200,
                1000, 11, 100000);
        ChinaBank chinaBankUSD = new ChinaBank(5, "China", Bank.Currency.USD, 200,
                1000, 10, 100000);
        ChinaBank chinaBankEUR = new ChinaBank(6, "China", Bank.Currency.EUR, 200,
                1000, 11, 100000);

        User userUSBankUSD = new User(1, "John", 5000, 10, "MSFT"
                , 1250, usBankUSD);
        User userUSBankEUR = new User(1, "John", 7000, 10, "MSFT"
                , 1300, usBankEUR);
        User userEUBankUSD = new User(1, "John", 6000, 10, "MSFT"
                , 1800, euBankUSD);
        User userEUBankEUR = new User(1, "John", 4000, 10, "MSFT"
                , 1500, euBankEUR);
        User userChinaBankUSD = new User(1, "John", 2000, 10, "MSFT"
                , 800, chinaBankUSD);
        User userChinaBankEUR = new User(1, "John", 1500, 10, "MSFT"
                , 500, chinaBankEUR);

        MyBankSystem BankSystem = new MyBankSystem();

        System.out.println(userUSBankUSD);
        System.out.println("*****");
        System.out.println(userUSBankEUR);
        System.out.println("\n");
        System.out.println("Withdrawing");
        System.out.println("Withdraw 1000 from userUSBankUSD");
        BankSystem.withdrawOfUser(userUSBankUSD, 1000);
        System.out.println("\n");
        System.out.println(userUSBankUSD);
        System.out.println("\n");
        System.out.println("Withdraw 1500 from userUSBankEUR");
        try {
            BankSystem.withdrawOfUser(userUSBankEUR, 1500);
        }
        catch (Exception ex){
            System.out.println(ex);
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
        BankSystem.fundUser(userChinaBankEUR,5000);
        System.out.println(userChinaBankEUR);
        System.out.println("\n");
        System.out.println("Transfer");
        System.out.println("\n");
        BankSystem.transferMoney(userEUBankUSD,userEUBankEUR,1000);
        System.out.println("\n");
        System.out.println(userEUBankUSD);
        System.out.println("\n");
        System.out.println(userEUBankEUR);
    }
}
