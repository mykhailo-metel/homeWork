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

    public static void withdraw(int balance, int withdrawal) {
        double COMISSION = 0.05D;
        double totalWithdrawal = withdrawal * COMISSION + withdrawal;
        if (balance >= totalWithdrawal) {
            System.out.println(String.format("OK\t%.2f\t%.2f", withdrawal
                    * COMISSION, balance - totalWithdrawal));
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


        if (balances.length != ownerNames.length) { /*Надо удостовериться, что массивы одной длины*/
            throw new IllegalArgumentException("Arrays are of different length.");
        }

        //Надо найти клиента и баланс
        for (int i = 0; i < balances.length; i++) {
            if (ownerNames[i].equals(ownerName)) { //Если клиент найден,
                int balance = balances[i]; //получаем баланс
                double totalWithdrawal = withdrawal * 1.05; //считаем сумму списания
                if (totalWithdrawal <= balance) {// проверяем достаточно ли средств на счете
                    System.out.println(String.format("%s\t%.2f\t%.2f", ownerName, totalWithdrawal
                            , balance - totalWithdrawal));
                } else {
                    System.out.println(String.format("%s\tNO", ownerName));
                }
                return;
            }
        }
        System.out.println("Wrong name.");//Если такого человека нет, сообщаем, что имя введено неверно
    }


    //Homework 2. Task 4.

    /*
     *You need to write method which will fund (пополнение) balance of particular user. Print name
     * + balance after funding
     */
    public static void fundOneOfArray(int[] balances, String[] ownerNames, String ownerName, double funding) {

        //Я предполагаю, что ownerNames содержит уникальные идентификаторы счета

        if (balances.length != ownerNames.length) { /*Надо удостовериться, что массивы одной длины*/
            throw new IllegalArgumentException("Arrays are of different length.");
        }

        //Надо найти клиента и баланс
        for (int i = 0; i < balances.length; i++) {
            if (ownerNames[i].equals(ownerName)) { //Если клиент найден,
                int balance = balances[i]; //получаем баланс
                System.out.println(String.format("%s\t%.2f", ownerName, balance + funding));
                return;
            }
        }
        System.out.println("Wrong name.");//Если такого человека нет, сообщаем, что имя введено неверно
    }

}
