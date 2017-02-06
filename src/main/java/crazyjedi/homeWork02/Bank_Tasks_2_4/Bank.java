package homeWork02.Bank_Tasks_2_4;

/**
 * Created by Vlad on 05.02.2017.
 */
public class Bank {

    //Homework 2. Task 2.

    /*
     * Write method which withdraw money from account and takes commision 5% of the transaction. Print OK + commision +
     * balance after withdrawal. Print NO is withdrawal is not possible.
     */

    public static int withdraw(int balance, int withdrawal) {
        if(withdrawal<0){
            throw new IllegalArgumentException("Withdrawal must be >0");
        }
        final double COMISSION = 0.05D;
        double totalWithdrawal = withdrawal * COMISSION + withdrawal;
        if (balance >= totalWithdrawal) {
            System.out.println(String.format("OK\t%.2f\t%.2f", withdrawal
                    * COMISSION, balance - totalWithdrawal));
            return (int)Math.round(balance - totalWithdrawal);
        } else {
            System.out.println("NO");
        }
    }

    //Homework 2. Task 3.

    /*
     * You need to write method which withdraw money of particular account owner if he/she can. Print name + NO of
     * withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case.
     * Commision is 5% for all cases.
     */
    public static void withdrawFromOneOfArray(int[] balances, String[] ownerNames
                                                , String ownerName, double withdrawal) {
        //Я предполагаю, что ownerNames содержит уникальные идентификаторы счета

        if (balances.length != ownerNames.length) {
            throw new IllegalArgumentException("Arrays are of different length.");
        }

        if (ownerName.isEmpty()){
            throw new IllegalArgumentException("Owner's name must be declared.");
        }

        if(balances.length==0){
            throw new IllegalArgumentException("Arrays are empty.");
        }

        if(withdrawal<0){
            throw new IllegalArgumentException("Withdrawal amount must be >0.");
        }

        final double COMISSION_COEFFICIENT = 1.05;

        //Надо найти клиента и баланс
        for (int i = 0; i < balances.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                int balance = balances[i];

                double totalWithdrawal = withdrawal * COMISSION_COEFFICIENT;
                if (totalWithdrawal <= balance) {
                    System.out.println(String.format("%s\t%.2f\t%.2f", ownerName, totalWithdrawal
                            , balance - totalWithdrawal));
                    balances[i]=(int)Math.round(balance - totalWithdrawal);//нехорошо так делать, но что еще сделать с int и double не придумал(
                } else {
                    System.out.println(String.format("%s\tNO", ownerName));
                }
                return;
            }
        }
        System.out.println("Wrong name.");
    }


    //Homework 2. Task 4.

    /*
     *You need to write method which will fund (пополнение) balance of particular user. Print name
     * + balance after funding
     */
    public static void fundOneOfArray(int[] balances, String[] ownerNames, String ownerName, double funding) {

        //Я предполагаю, что ownerNames содержит уникальные идентификаторы счета

        if (balances.length != ownerNames.length) {
            throw new IllegalArgumentException("Arrays are of different length.");
        }

        if(funding<0){
            throw new IllegalArgumentException("Funding<0. Use Bank.withdraw method to withdraw from account.");
        }

        if(balances.length==0){
            throw new IllegalArgumentException("Arrays are empty.");
        }

        if (ownerName.isEmpty()){
            throw new IllegalArgumentException("Owner's name must be declared.");
        }

        for (int i = 0; i < balances.length; i++) {
            if (ownerNames[i].equals(ownerName)) { //Если клиент найден,
                int balance = balances[i]; //получаем баланс
                System.out.println(String.format("%s\t%.2f", ownerName, balance + funding));
                balances[i]+=funding;
                return;
            }
        }
        System.out.println("Wrong name.");//Если такого человека нет, сообщаем, что имя введено неверно
    }

}
