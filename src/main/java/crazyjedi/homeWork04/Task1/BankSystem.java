package crazyjedi.homeWork04.Task1;

/**
 * Created by Vlad on 20.02.2017.
 */
public interface BankSystem {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
