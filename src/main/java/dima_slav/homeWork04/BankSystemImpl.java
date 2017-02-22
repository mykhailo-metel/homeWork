package dima_slav.homeWork04;

public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        double withdrawal;
        double commission;
        double limit = user.getBank().getLimitOfWithdrawal();
        if (amount >= limit) {
            System.out.println("Лимит превышен!");
        } else if (amount >= user.getBalance()) {
            System.out.println("Недостаточно средст на счете!");

        } else if (amount < user.getBalance() & amount < user.getBank().getLimitOfWithdrawal()) {
            commission = (double) user.getBank().getCommission(amount) / 100;//переводим в десятичную дробь для удобства в расчетах
            withdrawal = user.getBalance() - ((double) amount * (1 + commission));
            user.setBalance(withdrawal);
            System.out.println("Остаток: " + withdrawal);
        }

    }


    @Override
    public void fundUser(User user, int amount) {
        double fund;
        double limit = user.getBank().getLimitOfFunding();
        if (amount >= limit) {
            System.out.println("Лимит превышен");
        } else {
            fund = user.getBalance() + amount;
            user.setBalance(fund);
            System.out.println("Баланс пополнено! На счету: " + user.getBalance());
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double limitFrom = fromUser.getBank().getLimitOfWithdrawal();
        double limitTo = toUser.getBank().getLimitOfFunding();
        if (amount >= limitFrom) {
            System.out.println("Лимит на отправление превышен!");
        } else if (amount >= limitTo) {
            System.out.println("Лимит на получение превышен!");
        } else if (fromUser != toUser && amount < fromUser.getBalance() && amount < fromUser.getBank().getLimitOfWithdrawal()) {
            fromUser.withdrawOfUser(fromUser, amount);
            toUser.fundUser(toUser, amount);
            System.out.println(fromUser.getName() + " перевел " + amount + " на счет " + toUser.getName());
        } else {
            System.out.println("Вы не можете это сделать!");
        }

    }

    @Override
    public void paySalary(User user) {
        double balance = user.getBalance() + user.getSalary();
        user.setBalance(balance);
        System.out.println(balance);

    }
}

