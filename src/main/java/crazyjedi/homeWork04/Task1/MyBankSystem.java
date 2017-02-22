package crazyjedi.homeWork04.Task1;


import java.math.BigDecimal;

/**
 * Created by Vlad on 20.02.2017.
 */
public class MyBankSystem implements BankSystem{

    private final static BigDecimal exchangeRate = new BigDecimal("1.1");

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank bank =user.getBank();
        if(bank.getLimitOfWithdrawal()<amount){
            throw new IllegalArgumentException("Can not withdraw such amount.");
        }
        if(amount<0){
            throw new IllegalArgumentException("Amount should be > 0");
        }
        int comission = user.getBank().getCommission(amount);
        BigDecimal totalAmount = new BigDecimal(amount);
        totalAmount.setScale(2,BigDecimal.ROUND_HALF_UP);
        totalAmount.add(new BigDecimal(comission));
        user.setBalance(user.getBalance().subtract(totalAmount).doubleValue());
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank bank =user.getBank();
        if(bank.getLimitOfFunding()<amount){
            throw new IllegalArgumentException("Limit of funding does not allow this.");
        }
        if(amount<0){
            throw new IllegalArgumentException("Amount should be > 0");
        }
        user.setBalance(user.getBalance().add(new BigDecimal(amount)).doubleValue());
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if(fromUser==toUser){
            return;
        }
        //Нужно учесть разницу в курсе доллара к евро, если валюты разные
        exchangeRate.setScale(2,BigDecimal.ROUND_HALF_UP);
        if(fromUser.getBank().getCurrency().equals(Bank.Currency.USD)&&
                toUser.getBank().getCurrency().equals(Bank.Currency.EUR)
                ){
            amount = exchangeRate.multiply(new BigDecimal(amount)).intValue();
        }
        if(fromUser.getBank().getCurrency().equals(Bank.Currency.EUR)&&
                toUser.getBank().getCurrency().equals(Bank.Currency.USD)
                ){
            amount = exchangeRate.divide(new BigDecimal(amount),BigDecimal.ROUND_HALF_UP).intValue();
        }

        withdrawOfUser(fromUser,amount);
        fundUser(toUser,amount);
    }

    @Override
    public void paySalary(User user) {
        fundUser(user,user.getSalary().intValue());
    }
}
