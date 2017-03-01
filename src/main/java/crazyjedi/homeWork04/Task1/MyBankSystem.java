package crazyjedi.homeWork04.Task1;


import java.math.BigDecimal;

/**
 * Created by Vlad on 20.02.2017.
 */
public class MyBankSystem implements BankSystem {

    private BigDecimal exchangeRate;

    public MyBankSystem(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank bank = user.getBank();

        BigDecimal comission = bank.getCommission(amount);
        BigDecimal totalAmount = MoneyBigDecimal.createMoneyDecimal(amount);
        totalAmount=totalAmount.add(comission);
        int a = bank.getLimitOfWithdrawal();
        if (MoneyBigDecimal.createMoneyDecimal(bank.getLimitOfWithdrawal()).compareTo(totalAmount)<0&&
                bank.getLimitOfWithdrawal()!=-1) {
            throw new IllegalArgumentException("Limit of withdrawal is too small.");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Amount should be > 0");
        }
        user.setBalance(MoneyBigDecimal.createMoneyDecimal(user.getBalance()).subtract(totalAmount));
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank bank = user.getBank();
        if (bank.getLimitOfFunding() < amount&&
                bank.getLimitOfFunding()!=-1) {
            throw new IllegalArgumentException("Limit of funding does not allow this.");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Amount should be > 0");
        }
        user.setBalance(user.getBalance().add(new BigDecimal(amount)));
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser == toUser) {
            return;
        }
        //Нужно учесть разницу в курсе доллара к евро, если валюты разные
        exchangeRate=MoneyBigDecimal.createMoneyDecimal(exchangeRate);
        if (fromUser.getBank().getCurrency().equals(Bank.Currency.USD) &&
                toUser.getBank().getCurrency().equals(Bank.Currency.EUR)
                ) {
            amount = exchangeRate.multiply(new BigDecimal(amount)).intValue();
        }
        if (fromUser.getBank().getCurrency().equals(Bank.Currency.EUR) &&
                toUser.getBank().getCurrency().equals(Bank.Currency.USD)
                ) {
            amount = exchangeRate.divide(new BigDecimal(amount), BigDecimal.ROUND_HALF_UP).intValue();
        }

        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        fundUser(user, user.getSalary().intValue());
    }
}
